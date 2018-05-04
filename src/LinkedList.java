public class LinkedList<E> {
    static class Node<E> {
        E value;
        Node<E> next;

        Node(E value) {
            this.value = value;
        }
    }

    Node<E> head = new Node<E>(null);
    Node<E> tail = head;
    int size;

    void add(E value) {
        tail = tail.next = new Node<E>(value);
        size++;
    }

    E get(int index) throws OutOfBoundsException {
        if(index < 0 || size <= index){
        	Integer indexecep=new Integer(index);
            throw new OutOfBoundsException(indexecep);
        }
        Node<E> node = head.next;
        while(index > 0) {
            node = node.next;
            index--;
        }

        return node.value;
    }
}