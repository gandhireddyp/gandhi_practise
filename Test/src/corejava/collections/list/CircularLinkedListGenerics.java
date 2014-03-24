package corejava.collections.list;

public class CircularLinkedListGenerics<E> {

	Node<E> header;
	int size;

	public CircularLinkedListGenerics() {
		header = new Node<E>(null, null, null);
		size = 0;
	}

	public void add(final E element) {
		final Node<E> newElement = new Node<E>(element);
		if (header.next == null) {
			header.next = newElement;
			header.previous = newElement;
			size++;
		} else {
			Node<E> pivot = header;
			while (pivot.next != header) {
				pivot = pivot.next;
			}
			pivot.next = newElement;
			newElement.next = header;
			newElement.previous = pivot;
			header.previous = newElement;
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
			System.out.println(pivot.element);
			pivot = pivot.next;
		} while (pivot.next != header);
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

	public int size() {
		return size;
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
		}
	}

}
