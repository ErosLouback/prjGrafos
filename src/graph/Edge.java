package graph;

public class Edge {

    private int m_ID;
    private Node source;
    private Node target;
    private double weight;

    public Edge(int m_ID, Node source, Node target, double weight) {
        this.m_ID = m_ID;
        this.source = source;
        this.target = target;
        this.weight = weight;
    }

    public int getM_ID() {
        return m_ID;
    }

    private void setM_ID(int m_ID) {
        this.m_ID = m_ID;
    }

    public Node getSource() {
        return source;
    }

    private void setSource(Node source) {
        this.source = source;
    }

    public Node getTarget() {
        return target;
    }

    private void setTarget(Node target) {
        this.target = target;
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

}
