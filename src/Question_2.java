import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = number.nextInt();
        int digit = countDigit(x);
        System.out.println("Number of digits in "+x+": "+digit);
    }
    public static int countDigit(int x){
        x=Math.abs(x);
        if (x==0){
            return 1;
        }
        int count=0;
        while(x>0){
            x=x/10;
            count++;
        }
        return count;
    }
}
