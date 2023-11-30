/**
 * Starter code for P3
 *
 * @author rb
 * @author Jonathan
 * @author Ankit Sahu
 * @author Sai Kumar Miriyala
 * @author Jeb Alton
 */

// Change to your net id
package MDS;

// If you want to create additional classes, place them in this file as subclasses of MDS

import java.util.*;

public class MDS {
    // Add fields of MDS here

    //Invariant: Any item that exists will have 1 and only 1 entry in this tree from ID to Item
    TreeMap<Integer, Item> tree; //maps Integer (ID) to Item

    //Invariant: Every unique desc-long that is in some item of tree is present in this HashMap (and no more are there),
    // and points to a set of all items containing that desc-long.
    HashMap<Integer, TreeSet<Item>> table;  //maps Integer (a description item) to set of Items

    // Constructors
    public MDS() {
        // initialize both ds with new instance
        tree = new TreeMap<>();
        table = new HashMap<>();
    }

     static class Item implements Comparable<Item> {
        private int id;
        private int price;
        private List<Integer> description;


        public Item(int id, int price, List<Integer> description) {
            this.id = id;
            this.description = new LinkedList<>(description);
            this.price = price;
        }

        // getter and setter for description
        public List<Integer> getDescription() {
            return this.description;
        }

        public void setDescription(List<Integer> desc) {
            this.description = new LinkedList<>(desc);
        }

        // getter and setter for price of each item
        public int getPrice() {
            return this.price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public int compareTo(Item o) {
            return Integer.compare(id, o.id);
        }
    }

    /* Public methods of MDS. Do not change their signatures.
     */

    /**
     * Insert(id,price,list): insert a new item whose description is given in the list.
     * If an entry with the same id already exists, then its description and price are replaced by the new values,
     * unless list is null or empty, in which case, just the price is updated.
     *
     * @return 1 if the item is new, 0 otherwise
     **/
    public int insert(int id, int price, List<Integer> list) {

        Item oldItem = tree.get(id);

        // tree does not contain item with given id.
        if (oldItem == null) {
            //new product

            //creating and putting the new item in the tree
            Item newItem = new Item(id, price, list);
            tree.put(id, newItem);

            //calling addItemToDescriptors method to modify the newItem in table data structure
            addItemToDescriptors(list, newItem);
            // return 1 indicating the item is not already present in data structure tree (TreeMap<Integer, Item> tree;) and we are adding it to the tree ds.
            return 1;

        } else {
            // the given id is present already in map data structure, so just setting the price
            oldItem.setPrice(price);

            //
            for (int desc : oldItem.getDescription()) {
                TreeSet<Item> descriptorSet = table.get(desc);

                // if current id descriptorSet is not null, remove it
                if (descriptorSet != null) {
                    descriptorSet.remove(oldItem);
                    // if descriptorSet is empty, remove it from the table data structure
                    if (descriptorSet.isEmpty()) table.remove(desc);
                }
            }
            // setting the description again with list provided
            oldItem.setDescription(new LinkedList<>(list));
            // add the list to the table (id, treeset<Item>) data structure
            addItemToDescriptors(list, oldItem);

            // return 0 indicating the item is already present in data structure tree (TreeMap<Integer, Item> tree;)
            return 0;
        }
    }

    /**
     * iterate through the list which is passed from insert method.
     * place an empty TreeSet if the current description has no element present previously
     * else just add the current item (old or new)
     * @param list  list of int values (description list)
     * @param item  item can be new or old
     */

    private void addItemToDescriptors(List<Integer> list, Item item) {

        for (int desc : list) {
            /*
            TreeSet<Item> descriptorSet = table.get(desc);
            if (descriptorSet == null) {
                descriptorSet = new TreeSet<>();
                table.put(desc, descriptorSet);
          }
          // same code is refactored to single line below using intelliJ suggestion
         */
            // Get the TreeSet associated with the current descriptor,
            // if null just place an empty treeSet at that descriptor
            TreeSet<Item> descriptorSet = table.computeIfAbsent(desc, k -> new TreeSet<>());

            // adding current item (old/new) to the descriptor
            descriptorSet.add(item);
        }
    }

    /**
     * b. Find(id): return price of item with given id (or 0, if not found).
     * @param id need to find item with id
     * @return 0 if item is null at given id else price of the item with given id.
     */

    public int find(int id) {
        // getting hold for the current item if present O(log(n))
        Item value = tree.get(id);
        // return 0 if item is null else getPrice() using defined getter
        return value == null ? 0 : value.getPrice();
    }

    /* 
       c. Delete(id): delete item from storage.  Returns the sum of the
       ints that are in the description of the item deleted,
       or 0, if such an id did not exist.
    */

    /**
     * Delete(id): delete item from storage.
     * @param id need to delete item with id
     * @return sum of the long ints that are in the description of the item deleted, or 0, if such an id did not exist.
     */
    public int delete(int id) {

        // getting hold of the item with given id and delete it if present O(log(n))
        Item item = tree.remove(id);
        // if item is not present, return 0;
        if (item == null) return 0;

        int sumOfDescriptionsList = 0;

        // iterate through the list of int
        for (int desc : item.getDescription()) {
            // with each desc, fetch the value from table data structure
            TreeSet<Item> temp = table.get(desc);
            // if there is at least one item with description(int values), remove the item
            if (temp != null) {
                temp.remove(item);
                // if it was the last item to be deleted, delete the key itself from the table data structure
                if (temp.isEmpty()) table.remove(desc);
            }
            // add the values one by one in sumOfDescriptionsList
            sumOfDescriptionsList += desc;
        }

        return sumOfDescriptionsList;

    }

    /**
     * FindMinPrice(n): given a long int, find items whose description contains that number
     * (exact match with one of the long ints in the item's description)
     * @param n need to find minimum item price with value n
     * @return lowest price of those items or 0 if there is no such item.
     */
    public int findMinPrice(int n) {
        // getting hold of the item with given one of int value in the description O(log(n))
        TreeSet<Item> minPriceItems = table.get(n);
        // if it is null or empty treeSet is present then return 0;
        if (minPriceItems == null || minPriceItems.isEmpty()) return 0;

        int minValue = Integer.MAX_VALUE;

        // Normal find minimum number of an array logic here

        for (Item item : minPriceItems) {

            int currPrice = item.getPrice();

            minValue = Math.min(currPrice, minValue);
        }

        return minValue;
    }

    /**
     * FindMaxPrice(n): given an integer, find items whose description
     * contains that number, and return highest price of those items.
     * @param n need to find maximum item price with value n
     * @return highest price of those items or 0 if there is no such item.
    */
    public int findMaxPrice(int n) {

        // getting hold of the item with given one of int value in the description O(log(n))
        TreeSet<Item> maxPriceItems = table.get(n);

        // if it is null or empty treeSet is present then return 0;
        if (maxPriceItems == null || maxPriceItems.isEmpty()) return 0;

        int maxValue = Integer.MIN_VALUE;

        // Normal find maximum number of an array logic here

        for (Item item : maxPriceItems) {

            int currPrice = item.getPrice();

            maxValue = Math.max(currPrice, maxValue);
        }

        return maxValue;
    }

    /**
     * FindPriceRange(n,low,high): given int n, find the number
     * of items whose description contains n, and in addition,
     * their prices fall within the given range, [low, high].
     * @param n item with one of the descriptions is value n
     * @param low with low value
     * @param high with high value
     * @return all the items having price with >= low and <= high, and maintain a counter++
    */
    public int findPriceRange(int n, int low, int high) {
        // no element can be iterated if low> high just return 0;
        if (low > high) return 0;
        // getting hold of the item with given one of int value in the description O(log(n))
        TreeSet<Item> itemList = table.get(n);

        // if it is null or empty treeSet is present then return 0;
        if (itemList == null || itemList.isEmpty()) return 0;

        int countItems = 0;

        // just iterate and find the values with >= low and <= high, and maintain a counter++
        for (Item item : itemList) {
            int currPrice = item.getPrice();

            if (currPrice >= low && currPrice <= high) countItems++;
        }

        return countItems;
    }

    /**
     * RemoveNames(id, list): Remove elements of list from the description of id.
     * It is possible that some of the items in the list are not in the
     * id's description.  Return the sum of the numbers that are actually
     * deleted from the description of id.  Return 0 if there is no such id.
     * @param id it is the id of the item, tree data structure is used for keeping track of the item as value and id as id
     * @param list list of values that are checked with the item
     * @return the sum of all  the int values that are present at the item with given id, if item with id is not present return 0
    */
    public int removeNames(int id, List<Integer> list) {
        // getting hold of the item with given id O(log(n))
        Item item = tree.get(id);
        // if no item is present with given id i.e null, or the list passed is empty or null, just return 0 with no modifying in the data structures
        if (item == null || list == null || list.isEmpty()) return 0;

        int sumOfRemovedElements = 0;
        // creating a newList with the item with given id.
        List<Integer> newList = new LinkedList<>(item.getDescription());

        // iterate through all the elements in the given list
        for (Integer i : list) {
            // if the item that we fetched contains any value from the list, add the value
            if (newList.contains(i)) {
                // add it
                sumOfRemovedElements += i;
                // fetch the value with int value that are key for table ds, get all the items with value i
                TreeSet<Item> descriptorSet = table.get(i);
                // if it is not null, remove the item from table values ds(value here)
                if (descriptorSet != null) {
                    descriptorSet.remove(item);
                    // if this was the last item to be removed from that particular int, remove the key itself.
                    if (descriptorSet.isEmpty()) table.remove(i);
                }
                // removing the value from present item list of description
                newList.remove(i);
            }
        }
        // after all the edits above, we are left with this new list, that needs to be updated to the item in tree (TreeMap) data structure
        item.setDescription(new LinkedList<>(newList));
        // put the value to tree ds
        tree.put(id, item);

        return sumOfRemovedElements;

    }
}

