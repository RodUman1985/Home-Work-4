package com.company;

public class LinkedList {
    private Node head;

    public void add(int v) {
        if (this.head == null) {
            this.head = new Node(v);
            return;
        }
        Node last = this.head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new Node(v);
    }

    public void print() {
        Node last = this.head;
        while (last != null) {
            System.out.print(last.value + "   ");

            last = last.next;
        }
        System.out.println();
    }

    public void remoove(int index) {
        if (this.head == null) {
            System.out.println("Список пуст");
            return;
        }
        Node last = this.head;
        Node prevNode = null;
        for (int i = 1; last != null; i++) {
            if (index == 1) {
                head = head.next;
                System.out.println("Итог");
                print();
                break;
            }
            if (index == i) {
                prevNode.next = last.next;
                System.out.println("Итог");
                print();
                break;
            }
            prevNode = last;
            last = last.next;
        }
        System.out.println();

    }

    public int get(int index) {
        if (this.head == null) {
            System.out.println("Список пуст");
                    }
        Node last = this.head;
        int z=0;
        for (int i = 1; last != null; i++) {
            if (index == i) {
                z= last.value;
            }

            }

        return z;
    }

}
