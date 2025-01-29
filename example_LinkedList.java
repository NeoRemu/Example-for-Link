
/**
 * Write a description of class example_LinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class example_LinkedList
{
    class Node {
    int data;
    Node next;  
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;
    
    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }
}
}
