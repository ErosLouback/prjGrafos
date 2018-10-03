package graph;

public class Node {
    private int ID;

    public Node(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    private void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Node{" + "ID=" + ID + '}';
    }
}
