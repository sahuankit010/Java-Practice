package TestExamples;

import java.util.PriorityQueue;

public class Assignment9 {

    public static int worstFit(int[] size, int C) {
        // Create a max heap to store available bin capacities (negative values).
        PriorityQueue<Integer> binCapacities = new PriorityQueue<>((a, b) -> b - a);

        int numBinsUsed = 0;

        for (int itemSize : size) {
            int newBinCapacity = C - itemSize;

            // Check if there's an available bin with enough capacity.
            if (!binCapacities.isEmpty() && binCapacities.peek() >= -itemSize) {
                int availableBin = binCapacities.poll();
                binCapacities.add(availableBin - itemSize);
            } else {
                // If no available bin can accommodate the item, create a new bin.
                binCapacities.add(newBinCapacity);
                numBinsUsed++;
            }
        }

        return numBinsUsed;
    }


    public static void main(String[] args) {
        int[] sizes = {3, 4, 2, 3};
        int capacity = 6;

        int binsUsed = worstFit(sizes, capacity);

        System.out.println("Number of bins used: " + binsUsed);
    }

}
