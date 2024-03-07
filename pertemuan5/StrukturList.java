package pertemuan5;

import pertemuan4.Node;

public class StrukturList {

	 private Node HEAD;

	    public void StrukturList(Node HEAD) {
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
	                if (posNode == null) { // insert at the end
	                    Node lastNode = HEAD;
	                    while (lastNode.next != null) {
	                        lastNode = lastNode.next;
	                    }
	                    lastNode.next = newNode;
	                } else {
	                    posNode.next = newNode;
	                    newNode.next = curNode;
	                }
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
	
	    
	    //remove head Latihan 1
	    public void removeHead() {
	        if (isEmpty()) {
	            System.out.println("List kosong");
	        } else {
	            Node temp = HEAD;
	            HEAD = HEAD.getNext();
	            dispose(temp);
	        }
	    }

	    private void dispose(Node temp) {
	        temp.setNext(null);
	        temp = null;
	    }
	    
	    //removetail latihan 3
	    public void removeTail() {
	        Node preNode = null;
	        Node lastNode = null;

	        if (HEAD != null) {
	            if (HEAD.getNext() == null) { // Jika satu elemen list
	                HEAD = null;
	            } else {
	                lastNode = HEAD;
	                while (lastNode.getNext() != null) {
	                    preNode = lastNode;
	                    lastNode = lastNode.getNext();
	                }
	                preNode.setNext(null);
	                dispose(lastNode);
	            }
	        }
	    }

	    
	    
	    //removeMid Latihan 1
	    public void removeMid(int e) {
	        Node preNode = new Node(0);
	        Node tempNode;
	        int i;
	        boolean ketemu;

	        if (isEmpty()) {
	            System.out.println("Elemen list kosong");
	        } else {
	            ketemu = false;
	            i = 1;
	            tempNode = HEAD;
	            while (tempNode.getNext() != null && !ketemu) {
	                if (tempNode.getData() == e) {
	                    ketemu = true;
	                } else {
	                    preNode = tempNode;
	                    tempNode = tempNode.getNext();
	                    i++;
	                }
	            }
	            if (ketemu) {
	                if (i == 1) {
	                    HEAD = null;
	                } else {
	                    preNode.setNext(tempNode.getNext());
	                    dispose(tempNode);
	                }
	            }
	        }
	    }


	
	
}
