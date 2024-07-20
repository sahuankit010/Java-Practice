package graphs;

import java.util.*;

public class TopologicalSort {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = Graph.getGraph();
        List<Integer> result = topSort(graph);
        System.out.println("Topological Sort is: ");
        for(int node: result){
            System.out.print(node + " ");
        }
    }

    private static List<Integer> topSort(Map<Integer, List<Integer>> graph){
        Deque<Integer> sortedNodes = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        for(int node: graph.keySet()){
            if(!visited.contains(node)){
                dfs(graph, node, visited, sortedNodes);
            }
        }

        return new ArrayList<>(sortedNodes);
    }

    private static void dfs(Map<Integer, List<Integer>> graph, int startNode, Set<Integer> visited, Deque<Integer> sortedNodes) {
        visited.add(startNode);

        if(graph.containsKey(startNode)){
            for(int neighbor: graph.get(startNode)){
                if(!visited.contains(neighbor)){
                    dfs(graph, neighbor, visited, sortedNodes);
                }
            }
        }

        sortedNodes.addFirst(startNode);
    }
}
