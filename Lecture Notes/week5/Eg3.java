//generic class
//IMPORTANT : <T> inside method insert hides class’s type T.
//IMPORTANT : You must not declare <T> again inside a method of a generic class.
class LinkedList<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next=null;
        }
    }

    private Node head;
    // WRONG: introduces a new type T – not the same as class-level T
    //This will cause type mismatch with Node class
    //public <T> void insert(T item) {
    public void insert(T item) {
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
    }

    public T getHead() {
        return head != null ? head.data : null;
    }

}

public class Eg3{
     public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();//new LinkedList<Strnig>();
        list.insert("Hello");
        list.insert("World");
        System.out.println(list.getHead());
        LinkedList<Integer> list1=new LinkedList<>();
        list1.insert(1);
        
    }
}



