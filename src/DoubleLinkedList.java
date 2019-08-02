
interface List1 {

    boolean isEmpty();

    void addHead(Long data);

    Long removeHead();

    void addTail(Long data);

    Long removeTail();
    
    int size();
    
    public void insertAfter(int position, Long data);
    
    public void insertBefore(int position, Long data);
}

class DoubleLinkedList implements List1 {
// 더블 링크드 리스트 노드의 정의
class Node {
    Long data;

    // 다음 노드를 가르키는 노드의 레퍼런스
    Node next;
    // 이전 노드를 가르키는 노드의 레퍼런스
    Node prev;
}

Node head; // first node of list
Node tail; // last node of list

public DoubleLinkedList() {
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
    newNode.prev = null;

    if (this.tail == null) {
        this.tail = newNode;
    } else {
        this.head.prev = newNode;
    }
    this.head = newNode;
}

public Long removeHead() {
    if (isEmpty())
        return null;

    Node temp = this.head;
    this.head = temp.next;
    if (this.head == null) {
        this.tail = null;
    } else {
        this.head.prev = null;
    }
    return temp.data;
}

public void addTail(Long data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;
    newNode.prev = this.tail;

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
    this.tail = temp.prev;

    if (this.tail == null) {
        this.head = null;
    } else {
        this.tail.next = null;
    }
    return temp.data;
}

public void insertAfter(int position, Long data) {
    Node next = this.head;
    while (position > 0 && next != null) {
        next = next.next;
        position--;
    }

    if (next == null) {
        throw new IndexOutOfBoundsException();
    }

    Node newNode = new Node();
    newNode.data = data;
    newNode.next = next.next;
    newNode.prev = next;

    if (next.next == null) {
        this.tail = newNode;
    } else {
        next.next.prev = newNode;
    }
}

public void insertBefore(int position, Long data) {
    Node next = this.head;
    while (position > 0 && next != null) {
        next = next.next;
        position--;
    }

    if (next == null && position != 0) {
        throw new IndexOutOfBoundsException();
    }

    Node newNode = new Node();
    newNode.data = data;
    newNode.next = next;
    newNode.prev = null;

    if (next == null) {
        this.head = this.tail = newNode;
    } else if (next.prev == null) {
        next.prev = newNode;
        this.head = newNode;
    } else {
        next.prev.next = newNode;
        newNode.prev = next.prev;
        next.prev = newNode;
    }
}

// 노드의 갯수를 리턴 한다.
public int size() {
    int count = 0;
    Node temp = this.head;
    while (temp != null) {
        temp = temp.next;
        count++;
    }
    return count;
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
        List1 a = new DoubleLinkedList();
    }

}