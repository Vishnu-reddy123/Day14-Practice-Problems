import java.io.*;
import java.util.LinkedList;
public class LinkedListUC5 {
    public static void main(String[] args) {
        //Creating an empty linked list
        LinkedList<Integer>list = new LinkedList<Integer>();
        //Using add() method to add elements in the list
        list.add(56);
        list.add(30);
        list.add(70);
        //Displaying the list
        System.out.println("LinkedList:" + list);
        //Remove the head using removeFirst() method
        System.out.println("The first element is:" + list.removeFirst());
        //Displaying the final list
        System.out.println("Final LinkedList:" + list);
    }
}
