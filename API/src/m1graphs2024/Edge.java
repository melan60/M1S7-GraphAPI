package m1graphs2024;

import java.util.Objects;

public class Edge implements Comparable<Edge> {
    private Node from;
    private Node to;

    private Integer weight;

    public Edge(Node from, Node to) {
        // Constraint 1: Both nodes must be non-null
        if (from == null || to == null) {
            throw new IllegalArgumentException("Both 'from' and 'to' nodes must be non-null");
        }

        // Constraint 2: Both nodes must belong to the same graph
        if (!from.getGraph().equals(to.getGraph())) {
            throw new IllegalArgumentException("Both nodes must belong to the same graph");
        }

        this.from = from;
        this.to = to;
    }

    public Edge(Node from, Node to, Integer weight) {
        this(from, to);
        this.weight = weight;
    }

    public Edge(int idFrom, int idTo) {
        // TODO use Graph - getNode method
//        this()
    }

    /**
     * Test if the given edge o is similar to the current edge
     * @param o given edge
     * @return true if the given edge is the same as the current one, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Edge)) return false;
        Edge edge = (Edge) o;
        return Objects.equals(from, edge.from) && Objects.equals(to, edge.to) && Objects.equals(weight, edge.weight);
    }

    /**
     * Generate an integer representing the current instance of the Edge class
     * @return an integer representing the current instance of the Edge class
     */
    @Override
    public int hashCode() {
        return Objects.hash(from, to, weight);
    }

    /**
     * Compare the given edge with the current one
     * @param o the given edge
     * @return 0 if the edges are identical, -1 if o is superior or 1 otherwise
     */
    @Override
    public int compareTo(Edge o) {
        // Step 1 : compare from node
        int comparedFrom = from.compareTo(o.from);
        if (comparedFrom == 0) {
            // Step 2 : compare to node
            int comparedTo = to.compareTo(o.to);
            if (comparedTo == 0) {
                // Step 3 : compare weight
                return Integer.compare(weight, o.weight);
            }
            else return comparedTo;
        }
        else return comparedFrom;
    }
}
