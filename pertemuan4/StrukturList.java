package pertemuan4;

public class StrukturList {

    private Node HEAD;

    public StrukturList(Node HEAD) {
        this.HEAD = HEAD;
    }

    public void addTail(double data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node posNode = null;
            Node curNode = HEAD;

            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }

            posNode.setNext(newNode);
        }
    }

    public void addHead(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.next = HEAD;
            HEAD = newNode;
        }
    }

    public void addMid(double data, int position) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node posNode = null;
            Node curNode = HEAD;
            int i = 1;
            if (position == 1) { // insert at the beginning
                newNode.next = curNode;
                HEAD = newNode;
            } else {
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.next;
                    i++;
                }
                posNode.next = newNode;
                newNode.next = curNode;
            }
        }
    }

    private boolean isEmpty() {
        return HEAD == null;
    }

  

    public void displayElement() {
        Node curNode = HEAD;

        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }
}
