package pertemuan5;

public class Latihan4RemoveTail {


    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Tambah elemen 2 di awal list
        list.addHead(2);
        // Tambah elemen 6 di awal list
        list.addHead(6);
        // Tambah elemen 3 di awal list
        list.addHead(3);
        // Tambah elemen 5 di awal list (seharusnya menambahkan di akhir, bukan di awal)
        list.addMid(5, 3); // Perhatikan apakah 3 ini sudah sesuai dengan posisi yang diinginkan
        // Tambah elemen 1 di akhir list
        list.addTail(1);

        // Hapus elemen di awal
        list.removeHead();

        // Hapus elemen di akhir
        list.removeTail();

        // Tampilkan elemen list
        list.displayElement(); // Output: 6 5 2
    }
	
}
