package m1graphs2024;

import java.util.List;
import java.util.Objects;

public class Node implements Comparable<Node> {
    int id;
    Graph graphHolder;

    Node(int id, Graph graphHolder) {
        this.id = id;
        this.graphHolder = graphHolder;
    }

    /**
     * Test if the given node o is similar to the current node
     * @param o given node
     * @return true if the given node is the same as the current one, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;

        Node node = (Node) o;
        return id == node.id && graphHolder.equals(node.graphHolder);
    }

    /**
     * Generate an integer representing the current instance of the Node class
     * @return an integer representing the current instance of the Node class
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, graphHolder);
    }

    /**
     * Compare the ID of the given node with the current one
     * @param o the gven node
     * @return 0 if the nodes are identical, -1 if o is superior or 1 otherwise
     */
    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.id, o.id);
    }

    /**
     * Get the id of the current node
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Get the graph holder of the current node
     * @return the graph holder
     */
    public Graph getGraph() {
        return graphHolder;
    }

    // TODO
//    public List<Node> getSuccessors() {
//
//    }

    // TODO
//    public List<Node> getSuccessorsMulti() {
//
//    }

    // TODO
//    public boolean adjacent(Node u) {
//
//    }

    // TODO
//    public int inDegree() {
//
//    }

    // TODO
//    public int outDegree() {
//
//    }

    // TODO
//    public int degree() {
//
//    }

    // TODO
//    public List<Edge> getOutEdges() {
//
//    }

    // TODO
//    public List<Edge> getInEdges() {
//
//    }

    // TODO
//    public List<Edge> getIncidentEdges() {
//
//    }

    // TODO
//    public List<Edge> getEdgesTo(Node u) {
//
//    }
}
