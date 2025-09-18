import java.util.*;

class Graphs
	{
    int v;
    private LinkedList<Integer>[] arr;

    Graphs(int node) {
        this.v = node;
        arr = new LinkedList[node];
        for (int i = 0; i < v; i++) {
            arr[i] = new LinkedList<>();
        }
    }

    public void insert(int s, int d) {
        arr[s].add(d);
        arr[d].add(s); 
    }

    public void print() {
        for (int i = 0; i < v; i++) {
            System.out.print("Node " + i + ": ");
            for (int neighbor : arr[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    public void DFS(int start) {
        boolean[] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        System.out.println("DFS Traversal:");
        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (!visited[current]) {
                visited[current] = true;
                System.out.print(current + " ");
                for (int neighbor : arr[current]) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        System.out.println();
    }
    public void BFS(int start) {
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);
        System.out.println("BFS Traversal:");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : arr[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println();
    }
    public static void main(String args[])
		{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        Graphs g = new Graphs(v);

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();
        System.out.println("Enter edges (source and destination):");
        for (int i = 0; i < e; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            g.insert(s, d);
        }
        g.print();

        System.out.print("Enter starting node for DFS: ");
        int dfsStart = sc.nextInt();
        g.DFS(dfsStart);

        System.out.print("Enter starting node for BFS: ");
        int bfsStart = sc.nextInt();
        g.BFS(bfsStart);
        sc.close();
    }
}
