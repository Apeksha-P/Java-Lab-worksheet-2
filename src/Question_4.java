import java.util.Scanner;
import java.util.Arrays;
public class Question_4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int[] num =new int[5];
        for (int i=0;i<5;i++){
            System.out.println("Enter number "+(i+1)+" :");
            int x= number.nextInt();
            num[i]=x;
        }
        int secondLargest = findSecondLarger(num);
        System.out.println("Second large number is : "+secondLargest);

    }
    public static int findSecondLarger(int[] num){
        Arrays.sort(num);
        return num[1];
    }
}
