package Walmart;

import java.util.Arrays;

/**
 * Your task is to implement a novel data structure - your project lead is calling it a power of two max heap.
 * The rest of your team is doing their best to come up with a better name.
 * The requirements of the data structure are as follows:
 *
 *
 * The heap must satisfy the heap property.
 * Every parent node in the heap must have 2^x children.
 * The value of x must be a parameter of the heap’s constructor.
 * The heap must implement an "insert" method.
 * The heap must implement a "pop max" method.
 * The heap must be implemented in Java.
 * The heap must be performant.
 * You must use a more descriptive variable name than x in your implementation.
 * Think carefully about how you implement each method, and manage the underlying data.
 * Performance is critical, so keep cycles and memory usage to a minimum.
 * Be sure to test your heap with very small and very large values of x.
 * As always, keep a weather eye out for sneaky edge cases.
 *
 */

public class Task1 {
    private int[] heap;
    private int size;
    private int degree;

    // Constructor to initialize the heap with the specified degree
    public Task1(int degree) {
        this.degree = degree;
        this.heap = new int[1]; // Initial size
        this.size = 0;
    }

    // Inserts a new element into the heap
    public void insert(int value) {
        // If the heap array is full, resize it to accommodate more elements
        if (size == heap.length - 1) {
            resizeHeap();
        }

        // Increment the size and add the new element at the end
        size++;
        heap[size] = value;

        // Maintain the heap property by bubbling up the newly added element
        heapifyUp(size);
    }

    // Removes and returns the maximum element from the heap
    public int popMax() {
        // If the heap is empty, throw an exception
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        // Save the maximum element (at the root)
        int max = heap[1];

        // Replace the root with the last element in the heap
        heap[1] = heap[size];
        size--;

        // Maintain the heap property by bubbling down the new root
        heapifyDown(1);

        // Return the saved maximum element
        return max;
    }

    // Restores the heap property by moving an element up the tree
    private void heapifyUp(int index) {
        int parent = index / degree;

        // Move up the tree as long as the element is greater than its parent
        while (index > 1 && heap[index] > heap[parent]) {
            swap(index, parent);
            index = parent;
            parent = index / degree;
        }
    }

    // Restores the heap property by moving an element down the tree
    private void heapifyDown(int index) {

        // Move down the tree as long as there are valid children
        while (index <= size / degree) {
            // Find the maximum child index
           int maxChildIndex = findMaxChildIndex(index);

            // Swap with the maximum child if the current element is smaller
            if (heap[index] < heap[maxChildIndex]) {
                swap(index, maxChildIndex);
                index = maxChildIndex;
            } else {
                break;
            }
        }
    }

    // Finds the index of the maximum child of a given node
    private int findMaxChildIndex(int index) {
        int maxChildIndex = index * degree + 1;
        int end = Math.min(size, index * degree + degree);

        // Iterate over the children to find the maximum
        for (int i = index * degree + 2; i <= end; i++) {
            if (heap[i] > heap[maxChildIndex]) {
                maxChildIndex = i;
            }
        }

        return maxChildIndex;
    }

    // Swaps two elements in the heap
    private void swap(int i, int j) {
        //swapping using temp variable
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Resizes the heap array to accommodate more elements
    private void resizeHeap() {
        heap = Arrays.copyOf(heap, heap.length * 2);
    }

    public static void main(String[] args) {
        // Example usage
        Task1 heap = new Task1(3);

        heap.insert(10);
        heap.insert(5);
        heap.insert(20);
        heap.insert(30);

        System.out.println("Max element: " + heap.popMax());
        System.out.println("Max element: " + heap.popMax());
    }
}
