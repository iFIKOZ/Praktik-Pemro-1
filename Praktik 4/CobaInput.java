import java.util.Scanner;

public class CobaInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda = ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Umur Anda = ");
        int umur = scanner.nextInt();

        System.out.println("Nama anda adalah "+nama);
        System.out.println("Umur anda adalah "+umur);
    }
}
