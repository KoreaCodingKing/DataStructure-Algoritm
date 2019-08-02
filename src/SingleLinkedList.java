import java.util.LinkedList;
import java.util.List;

import javax.xml.soap.Node;

public class SingleLinkedList {
    // �̱� ��ũ�� ����Ʈ ����� ����
    class Node {
        Long data;

        // ���� ��带 ����Ű�� ����� ���۷���
        Node next;
    }

    Node head; // first node of list
    Node tail; // last node of list

    public SingleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void addHead(Long data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = this.head;

        this.head = newNode;
        // tail�� ��,, �� ���� ó�� �����Ҷ��� ���Ѵ�
        if (this.tail == null) {
            this.tail = newNode;
        }
    }

    public Long removeHead() {
        if (isEmpty())
            return null;
 
        Node temp = this.head;
        this.head = temp.next;
        if (this.head == null) {
            this.tail = null;
        }
        return temp.data;
    }

    public void addTail(Long data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        
        // tail�� ��,, �� ���� ó�� �����Ҷ��� ���Ѵ�
        if (this.tail == null) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }
        this.tail = newNode;
    }

    public Long removeTail() {
        if (isEmpty())
            return null;
 
        Node temp = this.tail;
        Node last = this.head;

        // this.head == this.tail
        if (temp == last) {
            this.head = this.tail = null;
        } else {
            // previous node of tail node
            while (last != null && last.next != temp) {
                last = last.next;
            }
            last.next = null;
            this.tail = last;
        }
        return temp.data;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node temp = this.head;
        while (temp != null) {
            builder.append("[" + temp.data + "]\n");
            temp = temp.next;
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        List a = new LinkedList();
    }
}