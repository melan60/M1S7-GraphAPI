package m1graphs2024;

import java.util.Objects;

public class Node implements Comparable<Node> {
    int id;
    Graph graphHolder;

    Node(int id, Graph graphHolder) {
        this.id = id;
        this.graphHolder = graphHolder;
    }

    /**
     * Test if the given object o is similar to the current object
     * @param o given object
     * @return true if the given object is the same as the current one, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;

        Node node = (Node) o;
        return id == node.id && graphHolder.equals(node.graphHolder);
    }

    /**
     * Generate an integer representing the current instance of the class
     * @return an integer representing the current instance of the class
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, graphHolder);
    }

    /**
     * Compare the ID of the given node with the current one
     * @param o the node
     * @return an integer computed from the subtracted id
     */
    @Override
    public int compareTo(Node o) {
        return this.id - o.id;
    }
}
