package pertemuan5;

public class Latihan2RemoveMid {

	    public static void main(String[] args) {
	        StrukturList list = new StrukturList();

	        // Tambah elemen sehingga elemenlist berisi (2, 6, 3, 5, 1)
	        list.addHead(6);
	        list.addHead(2);
	        list.addMid(3, 0);
	        list.addTail(5);
	        list.addTail(1);

	        

	        // Hapus elemen 3 di tengah list
	        list.removeMid(3);

	        // Tampilkan elemen list setelah penghapusan
	        list.displayElement(); // Output: 2 6 5 1
	    }
	

}
