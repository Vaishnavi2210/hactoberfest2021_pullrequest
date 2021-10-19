##Java program to create a doubly linked list of n nodes and count the number of nodes
In this program, we will create a doubly linked list and count the number of nodes present in the list. To count the node, we traverse through the list by incrementing the counter by 1.

#Java program to create a doubly linked list of n nodes and count the number of nodes
What count of nodes presents above doubly linked list is 5.

##Algorithm

Define a Node class which represents a node in the list. It will have three properties: data, previous which will point to the previous node and next which will point to the next node.

Define another class for creating a doubly linked list, and it has two nodes: head and tail. Initially, head and tail will point to null.
addNode() will add node to the list:

It first checks whether the head is null, then it will insert the node as the head.
Both head and tail will point to a newly added node.
Head's previous pointer will point to null and tail?s next pointer will point to null.
If the head is not null, the new node will be inserted at the end of the list such that new node's previous pointer will point to tail.
The new node will become the new tail. Tail's next pointer will point to null.
a. countNodes() will count the number of nodes present in the list.

Define a variable counter and new node current which will point to the head node.
Traverse through the list to count the nodes by making the current node to point to next node in the list till current point to null.
Increment the counter by 1.
a. display() will show all the nodes present in the list.

Define a new node 'current' that will point to the head.
Print current.data till current points to null.
Current will point to the next node in the list in each iteration.

##Program:
public class CountList {  
  
    //Represent a node of the doubly linked list  
  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    //Represent the head and tail of the doubly linked list  
    Node head, tail = null;  
  
    //addNode() will add a node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //If list is empty  
        if(head == null) {  
            //Both head and tail will point to newNode  
            head = tail = newNode;  
            //head's previous will point to null  
            head.previous = null;  
            //tail's next will point to null, as it is the last node of the list  
            tail.next = null;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode's previous will point to tail  
            newNode.previous = tail;  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null  
            tail.next = null;  
        }  
    }  
  
    //countNodes() will count the nodes present in the list  
    public int countNodes() {  
        int counter = 0;  
        //Node current will point to head  
        Node current = head;  
  
        while(current != null) {  
            //Increment the counter by 1 for each node  
            counter++;  
            current = current.next;  
        }  
        return counter;  
    }  
  
    //display() will print out the elements of the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Prints each node by incrementing the pointer.  
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
  
    public static void main(String[] args) {  
  
        CountList dList = new CountList();  
        //Add nodes to the list  
        dList.addNode(1);  
        dList.addNode(2);  
        dList.addNode(3);  
        dList.addNode(4);  
        dList.addNode(5);  
  
        //Displays the nodes present in the list  
        dList.display();  
  
        //Counts the nodes present in the given list  
        System.out.println("\nCount of nodes present in the list: " + dList.countNodes());  
    }  
}  
Output:

Nodes of doubly linked list: 
1 2 3 4 5 
Count of nodes present in the list: 5

