package pertemuan4;

public class tugas {


	    public static void main(String[] args) {
	        StrukturList list1 = new StrukturList(null);
	        list1.addTail(2.1);
	        list1.addTail(3.4);
	        list1.addTail(4.5);
	        list1.displayElement();

	        System.out.println();

	        StrukturList list2 = new StrukturList(null);
	        list2.addHead(2.1);
	        list2.addHead(3.4);
	        list2.addMid(1.1, 3);
	        list2.addTail(4.5);
	        list2.addTail(5.5);
	        list2.displayElement();
	    }
	

	
}
