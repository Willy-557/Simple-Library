import java.util.Scanner;
import java.util.HashMap;

class Buku {
    String penulisBuku;
    int stokBuku;

    public Buku (String penulisBuku, int stokBuku){
        this.penulisBuku = penulisBuku;
        this.stokBuku = stokBuku;
    }


}

public class FileSimpleLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap <String, Buku> penyimpananBuku = new HashMap<>();

        while (true) {
            System.out.println("\n--- Library ---");
            System.out.println("1. Tambah buku baru");
            System.out.println("2. Lihat daftar buku");
            System.out.println("3. Pinjam buku");
            System.out.println("4. Kembalikan buku");
            System.out.println("5. Keluar");
            System.out.print(">> ");
            int opsi = scanner.nextInt();

            if (opsi == 5) {
                System.out.println("\nTerimakasih!");
                break;
            }
            else if (opsi > 5 || opsi < 1){
                System.out.println("\nInvalid input!");
            }
            else {
                switch (opsi) {
                    case 1:
                    scanner.nextLine();
                    System.out.print("\nMasukkan judul buku: ");
                    String judulBukuBaru = scanner.nextLine();
                    
                    System.out.print("Masukkan nama penulis: ");
                    String namaPenulisBuku = scanner.nextLine();

                    System.out.print("Masukkan Stok buku: ");
                    int stokBukuAwal = scanner.nextInt();

                    if (penyimpananBuku.containsKey(judulBukuBaru)){
                        System.out.println("\nBuku berjudul '" + judulBukuBaru + "' sudah ada di penyimpanan!");
                    }
                    else {
                        Buku bukuBaru = new Buku(namaPenulisBuku, stokBukuAwal);
                        penyimpananBuku.put(judulBukuBaru, bukuBaru);
                        System.out.println("\nBuku berjudul '" + judulBukuBaru + "' berhasil di-tambahkan ke penyimpanan");
                    }
                    break;

                    case 2:
                        int ctr = 1;
                        System.out.println();
                        for (String buku : penyimpananBuku.keySet()){
                            System.out.println(ctr + ". " + "Judul Buku   : " + buku );
                            Buku ambilDataBuku = penyimpananBuku.get(buku);
                            System.out.println("   Penulis buku : " + ambilDataBuku.penulisBuku);
                            System.out.println("   Stok buku    : " + ambilDataBuku.stokBuku);
                            System.err.println("-----------------------------");
                            ctr += 1;
                        }
                }
            }
        }
    }
}
