/*
public class SinglyLinkedList {
    // Class variables
   private static Node_old head;
   private static int numNodes;

   public SinglyLinkedList(Object data) {
       head = new Node_old(data);
   }

   public static void addAtHead(Object data) {
       Node_old temp = head;
       head = new Node_old(data);
       head.next = temp;
       numNodes++;
   }

   public static void addAtTail(Object data) {
       Node_old temp = head;
       while (temp.next != null) {
           temp = temp.next;
       }
       temp.next = new Node_old(data);
       numNodes++;
   }

   public static void printList() {
       Node_old temp = head;
       while (temp != null) {
           System.out.print(temp.data + " ");
           temp = temp.next;
       }
       System.out.println();
   }

   public static void deleteHead(){
       if (head == null) {
           throw new IllegalArgumentException("List is empty.");
       }
       head = head.next;
       numNodes--;
   }

   public static void deleteTail() {
       while (head.next.next != null) {
            head = head.next;
       }
   }

   public static void addAtIndex(int index, Object data){
       Node_old temp = head;
       Node_old holder;
       for (int i = 0; i < index - 1 && temp.next != null; i++) {
           temp = temp.next;
       }
       holder = temp.next;
       temp.next = new Node_old(data);
       temp.next.next = holder;
       numNodes++;
   }

   public static void removeAtIndex(int index){
       Node_old temp = head;
       Node_old holder;
       for(int i = 0; i < index - 1 && temp.next != null; i++) {
           temp = temp.next;
       }
       temp.next = temp.next.next;
       numNodes--;
   }
}
*/
