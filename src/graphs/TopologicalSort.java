package graphs;

import java.util.*;

/**
 * This class provides functionality to perform topological sorting on a graph.
 */
public class TopologicalSort {

    /**
     * Main method to execute the topological sort.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Graph graphInstance = new Graph();
        Map<Integer, List<Integer>> graph = graphInstance.getGraph();
        List<Integer> result = topSort(graph);
        System.out.println("Topological Sort is: ");
        for (int node : result) {
            System.out.print(node + " ");
        }
    }

    /**
     * Performs topological sort on the given graph.
     *
     * @param graph the graph to be sorted
     * @return a list representing the topologically sorted order of nodes
     */
    private static List<Integer> topSort(Map<Integer, List<Integer>> graph) {
        Deque<Integer> sortedNodes = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        for (int node : graph.keySet()) {
            if (!visited.contains(node)) {
                dfs(graph, node, visited, sortedNodes);
            }
        }

        return new ArrayList<>(sortedNodes);
    }

    /**
     * Depth-first search to visit nodes in topological order.
     *
     * @param graph       the graph
     * @param startNode   the starting node
     * @param visited     the set of visited nodes
     * @param sortedNodes the stack to hold the sorted nodes
     */
    private static void dfs(Map<Integer, List<Integer>> graph, int startNode, Set<Integer> visited, Deque<Integer> sortedNodes) {
        visited.add(startNode);

        if (graph.containsKey(startNode)) {
            for (int neighbor : graph.get(startNode)) {
                if (!visited.contains(neighbor)) {
                    dfs(graph, neighbor, visited, sortedNodes);
                }
            }
        }

        sortedNodes.addFirst(startNode);
    }
}
