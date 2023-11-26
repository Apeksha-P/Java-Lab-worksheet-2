import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("How many rows in pattern: ");
        int x = number.nextInt();
        for(int i=0;i<x;i++){
            for(int j=x;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
