public class LinkedList<T> {
    /**
     * Nodes used within the LinkedList.
     */
    static class Node<T> {
        private T value;
        private Node<T> nextNode;

        Node(T value) {
            this.value = value;
            this.nextNode = null;
        }
    }

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    /**
     * Appends Node to end of LinkedList
     * @param n - the Node to be appended.
     */
    public void append(Node<T> n) {
        if (this.head == null) {
            this.head = n;
            this.tail = n;
        } else {
            this.tail.nextNode = n;
            this.tail = n;
        }

        size++;
    }

    /**
     * Traverse LinkedList from head to tail. Print out its contents.
     */
    public void traverse() {
        Node<T> curr = this.head;
        while (curr != null) {
            System.out.println(curr.value);
            curr = curr.nextNode;
        }
    }

    /**
     * Removes a Node by finding its identical contents. By value, indirectly.
     * @param n
     */
    public void remove(Node<T> n) {
        remove(n.value);
    }

    /**
     * Removes a Node by its value.
     * @param t - the value to be sought.
     */
    public void remove(T t) {
        if (this.head.value == t) {
            removeNode(this.head);
        } else {
            Node<T> prev = this.head;
            Node<T> curr = this.head.nextNode;

            while (curr != null) {
                if (curr.value == t) {
                    removeNode(curr, prev);
                    break;
                }
                prev = curr;
                curr = curr.nextNode;
            }
        }
    }

    /**
     * Removes a Node by its index.
     * @param index - the index, 0 based, of the Node to be removed.
     */
    public void remove(int index) {
        if (index == 0) {
            removeNode(this.head);
        } else {
            int i = 1;
            Node<T> prev = this.head;
            Node<T> curr = this.head.nextNode;

            while (curr != null) {
                if (i == index) {
                    removeNode(curr, prev);
                    break;
                }
                prev = curr;
                curr = curr.nextNode;
                i++;
            }
        }
    }

    /**
     * Remove Node from LinkedList
     * @param n - the Node to be removed.
     * @param nPrev - the Node preceding -- used to keep the link.
     */
    private void removeNode(Node<T> n, Node<T> nPrev) {
        nPrev.nextNode = n.nextNode;
        n.nextNode = null;              //Disappears the Node -- no links to or from
        size--;
    }

    /**
     * Removes head
     * @param n - the head Node
     */
    private void removeNode(Node<T> n) {
        if (n == this.head) {
            this.head = n.nextNode;
            size--;
        }
    }
}
