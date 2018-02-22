public class SinglyLinkedList{
    private static Node head;
    private static int numNodes;

    public SinglyLinkedList(Object data){
        head = new Node(data);
    }

    public static void addAtHead(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
    }
}