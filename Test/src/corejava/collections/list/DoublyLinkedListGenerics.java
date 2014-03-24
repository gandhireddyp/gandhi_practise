package corejava.collections.list;

public class DoublyLinkedListGenerics<E> {

    Node<E> header;
    int size;

    public DoublyLinkedListGenerics() {
        header = new Node<E>(null);
        size = 0;
    }

    public void add(final E element) {
        final Node<E> newElement = new Node<E>(element);
        if (isEmpty()) {
            header.next = newElement;
            newElement.previous = header;
            size++;
        } else {
            Node<E> pivot = header;
            while (pivot.next != null) {
                pivot = pivot.next;
            }
            pivot.next = newElement;
            newElement.previous = pivot;
            size++;
        }
    }

    public void addFront(final E element) {
        final Node<E> newElement = new Node<E>(element);
        if (header.element == null) {
            header.next = newElement;
            header.previous = newElement;
            size++;
        } else {
            header.next.previous = newElement;
            newElement.previous = header;
            newElement.next = header.next;
            header.next = newElement;
            size++;
        }
    }

    public void printList() {
        Node<E> pivot = header;
        do {
            pivot = pivot.next;
            System.out.println(pivot.element);
        } while (pivot.next != null);
    }

    public void addRear(final E element) {

    }

    /*
     * public E removeFront() {
     * 
     * }
     * 
     * public E removeRear() {
     * 
     * }
     */

    public boolean Remove(final E element) {
        boolean flag = false;
        Node<E> pivot = header;
        if (!isEmpty()) {
            while (pivot.next != null) {
                pivot = pivot.next;
                if (pivot.element.equals(element)) {
                    pivot.previous.next = pivot.next;
                    if (pivot.next != null) {
                        pivot.next.previous = pivot.previous;
                    }
                    pivot.element = null;
                    pivot.next = pivot.previous = null;
                    flag = true;
                    size--;
                }
            }
        }
        return flag;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return header.next == null && size == 0;
    }

    public E getElement(final int index) {
        return getNodeAtIndex(index).element;
    }

    private Node<E> getNodeAtIndex(final int index) {
        if (index < 0 || index > size - 1) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        Node<E> pivot = header;
        for (int i = 0; i <= index; i++) {
            pivot = pivot.next;
        }
        return pivot;
    }

    public static class Node<E> {
        E element;
        Node<E> previous;
        Node<E> next;

        public Node(final E element, final Node<E> previous, final Node<E> next) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }

        public Node(final E element) {
            this.element = element;
            this.next = null;
            this.previous = null;
        }
    }

}
