// problem no 1971
// time complexity : O(V^2)

// space complexity : O(V^2) + O(V) + O(V)
// adcency matrix ------^       ^       ^
// visited array ---------------|       |
// recursive stack ---------------------|

// this solution has memeory limit exceeded as we are using
// adjacency matrix and they are not good for sparse graphs

class Solution {
    private boolean dfs(boolean[][] graph, int curr, int dest, boolean[] vis, int n) {
        if (curr == dest) return true;
        vis[curr] = true;

        for (int i = 0; i < n; i++) {
            if (graph[curr][i] && !vis[i]) {
                if (dfs(graph, i, dest, vis, n)) return true;
            }
        }

        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        boolean[][] adjacencyMatrix = new boolean[n][n];
        for (boolean[] row : adjacencyMatrix) {
            Arrays.fill(row, false);
        }
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            adjacencyMatrix[u][v] = true;
            adjacencyMatrix[v][u] = true;
        }
        boolean[] visited = new boolean[n];
        return dfs(adjacencyMatrix, source, destination, visited, n);
    }
}
