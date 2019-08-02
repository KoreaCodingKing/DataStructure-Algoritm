import java.util.LinkedList;
import java.util.List;

import javax.xml.soap.Node;

public class SingleLinkedList {
    // 싱글 링크드 리스트 노드의 정의
    class Node {
        Long data;

        // 다음 노드를 가르키는 노드의 레퍼런스
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
        // tail이 널,, 이 말은 처음 삽입할때를 말한다
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
        
        // tail이 널,, 이 말은 처음 삽입할때를 말한다
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