package com.array;

import java.util.*;

public class MinimumCostPathWithEdgeReversals {

    static class Edge {
        int to;
        int cost;

        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    public static int minCost(int n, int[][] edges) {

        // Build graph
        List<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add normal and reversed edges
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int w = e[2];

            // normal edge
            graph[u].add(new Edge(v, w));

            // reversed edge (cost = 2 * w)
            graph[v].add(new Edge(u, 2 * w));
        }

        // Dijkstra
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);

        PriorityQueue<long[]> pq =
                new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));

        dist[0] = 0;
        pq.offer(new long[]{0, 0}); // {cost, node}

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long cost = cur[0];
            int node = (int) cur[1];

            if (cost > dist[node]) continue;

            for (Edge e : graph[node]) {
                long newCost = cost + e.cost;
                if (newCost < dist[e.to]) {
                    dist[e.to] = newCost;
                    pq.offer(new long[]{newCost, e.to});
                }
            }
        }

        return dist[n - 1] == Long.MAX_VALUE ? -1 : (int) dist[n - 1];
    }

    // -------- MAIN METHOD FOR INTELLIJ --------
    public static void main(String[] args) {

        int n = 3;
        int[][] edges = {
                {2, 1, 1},
                {1, 0, 1},
                {2, 0, 16}
        };

        int result = minCost(n, edges);
        System.out.println(result); // Expected output: 4
    }
}
