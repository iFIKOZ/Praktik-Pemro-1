import java.util.Scanner;

public class BelajarElseif {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan umur anda = ");
        int umur = scanner.nextInt();
        if (umur <= 5 && umur >= 0){
            System.out.println("Anda masih balita");
        } else if (umur > 5 && umur <= 19){
            System.out.println("Anda sudah remaja");
        } else if (umur > 19){
            System.out.println("Anda sudah dewasa");
        } else{
            System.out.println("Umur anda tidak valid");
        }

    }
}