import java.util.Scanner;

public class BelajarForPolaVar2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan nilai n = ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 ==0){
                    System.out.print("*");
                } else {
                    if (j % 2 ==0){
                        System.out.print("-");
                    } else{
                        System.out.print("#");
                    }
                }
            }
            System.out.println("");
        } 
        scan.close();
    }
}