import java.util.Scanner; // mengimpor kelas Scanner untuk menerima input dari pengguna

public class HitungCariKata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // membuat objek Scanner untuk menerima input dari pengguna
        String teks, kata; // variabel untuk menyimpan teks dan kata yang diinputkan pengguna
        int jumlahKata, jumlahKataDicari; // variabel untuk menyimpan jumlah kata dalam teks dan jumlah kata yang dicari

        System.out.print("Masukkan teks: ");
        teks = input.nextLine(); // menerima input teks dari pengguna

        System.out.print("Masukkan kata yang ingin dicari: ");
        kata = input.nextLine(); // menerima input kata dari pengguna

        // Menghitung jumlah kata dalam teks
        if (teks.isEmpty()) { // jika teks kosong, maka jumlah kata adalah 0
            jumlahKata = 0;
        } else { // jika teks tidak kosong, maka jumlah kata adalah panjang array yang dihasilkan dari memecah teks berdasarkan spasi
            jumlahKata = teks.split("\\s+").length;
        }

        // Menghitung jumlah kata yang dicari dalam teks
        jumlahKataDicari = 0; // inisialisasi jumlah kata yang dicari dengan 0
        for (String s : teks.split("\\s+")) { // melakukan perulangan untuk setiap kata dalam teks
            if (s.equalsIgnoreCase(kata)) { // jika kata dalam teks sama dengan kata yang dicari (mengabaikan huruf besar atau kecil), maka tambahkan jumlah kata yang dicari dengan 1
                jumlahKataDicari++;
            }
        }

        // Menampilkan hasil perhitungan
        System.out.println("Jumlah kata dalam teks: " + jumlahKata);
        System.out.println("Jumlah kata \"" + kata + "\" dalam teks: " + jumlahKataDicari);
    }
}