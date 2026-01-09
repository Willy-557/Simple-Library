import java.util.Scanner;
import java.util.HashMap;

class Buku {

}

public class FileSimpleLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap <String, Buku> penyimpananBuku = new HashMap<>();

        while (true) {
            System.out.println("--- Library ---");
            System.out.println("1. Tambah buku baru");
            System.out.println("2. Lihat daftar buku");
            System.out.println("3. Pinjam buku");
            System.out.println("4. Kembalikan buku");
            System.out.println("5. Keluar");
            System.out.print(">>");
            int opsi = scanner.nextInt();

            if (opsi == 5) {
                System.out.println("Terimakasih!");
                break;
            }
            else if (opsi > 5 || opsi < 1){
                System.out.println("Invalid input!");
            }
            else {
                
            }
        }
    }
}
