import java.util.*;

public class DijkstraExample {
    private static final int INF = Integer.MAX_VALUE;

    public static void dijkstra(int[][] graph, int startVertex) {
        int numVertices = graph.length;
        boolean[] visited = new boolean[numVertices];
        int[] distance = new int[numVertices];

        // Initialize distances
        Arrays.fill(distance, INF);
        distance[startVertex] = 0;

        for (int i = 0; i < numVertices - 1; i++) {
            int u = findMinDistance(distance, visited);
            visited[u] = true;

            for (int v = 0; v < numVertices; v++) {
                if (!visited[v] && graph[u][v] != 0 &&
                    distance[u] != INF &&
                    distance[u] + graph[u][v] < distance[v]) {
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }

        // Print shortest distances
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < numVertices; i++) {
            System.out.println(i + "\t\t" + distance[i]);
        }
    }

    private static int findMinDistance(int[] distance, boolean[] visited) {
        int min = INF, minIndex = -1;

        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && distance[i] < min) {
                min = distance[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = scanner.nextInt();

        int[][] graph = new int[V][V];
        System.out.println("Enter the adjacency matrix (0 if no edge):");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the starting vertex (0 to " + (V - 1) + "): ");
        int startVertex = scanner.nextInt();

        dijkstra(graph, startVertex);
    }
}
