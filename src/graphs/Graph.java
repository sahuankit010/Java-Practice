package graphs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class represents a graph using an adjacency list.
 */
public class Graph {

    private final Map<Integer, List<Integer>> graph;

    /**
     * Constructor to initialize the graph.
     */
    public Graph() {
        this.graph = initializeGraph();
    }

    /**
     * Initializes the graph with predefined edges.
     *
     * @return the graph represented as a map
     */
    private Map<Integer, List<Integer>> initializeGraph() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(2, Arrays.asList(3));
        graph.put(1, Arrays.asList(5, 2));
        graph.put(6, Arrays.asList(1, 5));
        graph.put(5, Arrays.asList(3, 4));
        printGraph(graph);
        return graph;
    }

    /**
     * Prints the adjacency list of the graph.
     *
     * @param graph the graph to be printed
     */
    private void printGraph(Map<Integer, List<Integer>> graph) {
        System.out.println("Adjacency List is:");
        for (int k : graph.keySet()) {
            System.out.print(k + ": ");
            for (int v : graph.get(k)) {
                System.out.print(v + ", ");
            }
            System.out.println();
        }
    }

    /**
     * Returns the graph.
     *
     * @return the graph as a map
     */
    public Map<Integer, List<Integer>> getGraph() {
        return this.graph;
    }
}
