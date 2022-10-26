package LinkedList;

public interface Node <T> {
    public T getKey();
    public void setKey(T key);

    Node getNext();
    public void setNext(Node next);
}
