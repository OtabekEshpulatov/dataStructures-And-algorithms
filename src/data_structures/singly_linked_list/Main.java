package data_structures.singly_linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}