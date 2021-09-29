import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan ipk Anda = ");
        double ipk = scanner.nextDouble();

        System.out.print("Masukan lama masa studi = ");
        double lulus = scanner.nextDouble();
        
        if (ipk >= 3.51 && lulus <= 4){
            System.out.println("Selamat, predikat anda Summa Cumlaude dengan IPK " + ipk);
        } else if (ipk >= 3.51){
            System.out.println("Selamat, predikat anda Cumlaude dengan IPK " + ipk);
        } else if (ipk >= 3.01 && ipk < 3.51){
            System.out.println("Selamat, predikat anda Sangat Memuaskan dengan IPK " + ipk);
        } else if (ipk >= 2.76 && ipk < 3.01){
            System.out.println("Selamat, predikat anda Memuaskan dengan IPK " + ipk);
        } else if (ipk >= 2.00 && ipk < 2.76){
            System.out.println("Selamat, predikat anda dinilai Cukup dengan IPK " + ipk);
        } else if (ipk < 2.00){
            System.out.println("Mohon maaf, Anda Tidak Lulus, IPK Anda " + ipk);
        } else if (ipk >= 4.00 || ipk < 0){
            System.out.println("Input Tidak Valid"); 
        }

    }
}