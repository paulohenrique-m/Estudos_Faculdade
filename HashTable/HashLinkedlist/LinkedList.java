public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // function to insert a Node in the last position of the linked list
    public void insert(Contact value) {
        Node tmp = new Node(value);
        if (this.head == null) {
            this.head = tmp;
            tmp = null;
        } else {
            Node i = this.head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = tmp;
            tmp = null;
        }
    }

    // function to remove a Node in the first position of the linked list
    public Contact remove() {
        if (this.head == null) {
            System.out.println("empty list");
            return null;
        } else {
            Node tmp = this.head;
            this.head = this.head.next;
            tmp.next = null;
            return tmp.value;
        }
    }

    // function to search a Contact inside the linked list.
    // using in hashtable
    public boolean search(Contact value) {
        Node i = this.head;
        for (; i != null; i = i.next) {
            if (value == i.value) {
                return true;
            }
        }
        return false;
    }
}
