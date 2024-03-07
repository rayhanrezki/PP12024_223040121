package pertemuan5;

public class Latihan2RemoveHead {

	
	public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Tambah elemen 2 di awal list
        list.addHead(7);
        // Tambah elemen 9 di awal list
        list.addMid(9, 0);
        // Tambah elemen 7 di awal list
        list.addTail(2);
        //Hapus elemen di awal
	    list.removeHead();
	    
        // Tampilkan elemen list
        list.displayElement(); // Output: 7 9 2
        

       
    }
}
