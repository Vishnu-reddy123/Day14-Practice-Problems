import java.io.*;
import java.util.LinkedList;
public class LinkedListUC6 {
    public static void main(String[] args) {
        //Creating an empty linked list
        LinkedList<Integer>list = new LinkedList<Integer>();
        //Using add() method to add elements in the list
        list.add(56);
        list.add(30);
        list.add(70);
        //Displaying the list
        System.out.println("LinkedList:" + list);
        //Remove the tail using removeLast() method
        System.out.println("The last element is:" + list.removeLast());
        //Displaying the final list
        System.out.println("Final LinkedList:" + list);
    }
}
