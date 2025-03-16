package graphs;

import java.util.*;

/**
 * This class implements Dijkstra's algorithm to find the shortest paths from a source node.
 */
public class Dijkstra {

    /**
     * Runs Dijkstra's algorithm on the given graph from the specified source node.
     *
     * @param weightedGraph the graph to run the algorithm on
     * @param source the source node
     * @return a map of shortest distances from the source node to each other node
     */
    public static Map<Integer, Integer> dijkstra(WeightedGraph weightedGraph, int source) {
        // Initialize the weighted graph

        // Get the adjacency list with weights
        // node with the neighbor and distance between the node and its neighbor
        Map<Integer, Map<Integer, Integer>> adjList = weightedGraph.getGraph();

        // Map to store the shortest distance from the source to each node
        Map<Integer, Integer> distances = new HashMap<>();

        // Initialize all distances to infinity, except the source which is set to 0
        for (int node : adjList.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(source, 0);

        // Priority queue to select the node with the smallest distance
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue());
        pq.offer(Map.entry(source, 0));

        // Main loop to process nodes in the priority queue
        while (!pq.isEmpty()) {
            // Get the node with the smallest distance
            Map.Entry<Integer, Integer> current = pq.poll();
            int currentNode = current.getKey();
            int currentDist = current.getValue();

            // Skip processing if we have already found a shorter path to this node
            if (currentDist > distances.get(currentNode)) {
                continue;
            }

            // Iterate through neighbors of the current node
            for (Map.Entry<Integer, Integer> neighbor : adjList.get(currentNode).entrySet()) {
                // Calculate the new distance to the neighbor
                int newDist = currentDist + neighbor.getValue();
                // If the new distance is shorter, update the distance and add to the queue
                if (newDist < distances.get(neighbor.getKey())) {
                    distances.put(neighbor.getKey(), newDist);
                    pq.offer(Map.entry(neighbor.getKey(), newDist));
                }
            }
        }

        // Return the map of shortest distances
        return distances;
    }

    /**
     * Main method to test the Dijkstra algorithm implementation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Initialize the graph
        WeightedGraph weightedGraph = new WeightedGraph();
        // Define the source node
        int source = 0;
        // Run Dijkstra's algorithm from the source node
        Map<Integer, Integer> distances = dijkstra(weightedGraph, source);

        // Print the shortest paths from the source node
        System.out.println("Shortest paths from node " + source + ":");
        for (Map.Entry<Integer, Integer> entry : distances.entrySet()) {
            System.out.println("To node " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
