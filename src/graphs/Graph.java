package graphs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    static Map<Integer, List<Integer>> graph;
    public Graph() {
        getGraph();
    }

    static Map<Integer, List<Integer>> getGraph(){

        graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(2, Arrays.asList(3));
        graph.put(1, Arrays.asList(5, 2));
        graph.put(6, Arrays.asList(1, 5));
        graph.put(5, Arrays.asList(3, 4));
        printGraph();
        return graph;
    }

    static void printGraph(){
        System.out.println("Adjacency List is:");
        for(int k: graph.keySet()){
            System.out.print(k + ": ");
            for(int v: graph.get(k)){
                System.out.print(v + ", ");
            }
            System.out.println();
        }
    }
}
