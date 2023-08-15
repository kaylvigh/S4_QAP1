import org.w3c.dom.Node;
import java.io.*;
public class LinkedList {
    Node head;
    Node current;
    //    note: current = navigator / cursor

    class Node {
        String url;

        public Node(String url) {
            this.url = url;
            next = null;
            prev = null;
        }

        Node next, prev;
    }

    public Node getHead() {
        return head;
    }

    public void addUrl(String url) {
        Node node = new Node(url);

        if (head != null) {
            head.next = node;
            node.prev = head;
        }
        head = node;
        current = head;
    }

    public Node getCurrent() {
        return current;
    }

    public void currentNext() {
        if (current.next != null) {
            System.out.println("Next URL: " + current.next.url);
            current = current.next;
            return;
        } System.out.println("There is no forward URL!");
    }

    public void currentPrev() {
        if (current.prev != null) {
            System.out.println("Previous URL: " + current.prev.url);
            current = current.prev;
            return;
        } System.out.println("There is no previous URL!");
    }

    public void displayCurrent() {

        if (current != null) {
            System.out.println("Current Url: " + current.url);
        }
        else {
            System.out.println("There is no current URL.");
        }

        if (current.prev != null) {
            System.out.println("Previous Url: " + current.prev.url);
        }
        else {
            System.out.println("There is no previous URL.");
        }

        if (current.next != null) {
            System.out.println("Forward Url: " + current.next.url);
        }
        else {
            System.out.println("There is no forward URL.");
        }
    }


}
