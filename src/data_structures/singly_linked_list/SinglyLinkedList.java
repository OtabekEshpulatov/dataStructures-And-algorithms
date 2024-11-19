package data_structures.singly_linked_list;

import java.util.*;

public class SinglyLinkedList<T> implements List<T> {

    private Node<T> head;
    private Node<T> tail;


    public boolean add(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;

        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return List.of();
    }

    public int size() {
        int size = 0;

        Node<T> node = head;
        while (node != null) {
            size++;
            node = node.getNext();
        }

        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object o) {
        Node<T> current = head;

        while (current != null) {
            if (current.getData() == o ||
                    (current.getData() != null && current.getData().equals(o))) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }


    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "SinglyLinkedList{", "}");

        if (head != null) {
            Node<T> node = head;
            while (node != null) {
                sj.add(String.valueOf(node.getData()));

                node = node.getNext();
            }
        }


        return sj.toString();
    }
}
