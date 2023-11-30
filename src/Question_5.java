import java.util.Scanner;
import java.util.StringTokenizer;

public class Question_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String input = scanner.nextLine();
        String cleanInput = input.replaceAll("[^a-zA-Z]","").toLowerCase();
        StringTokenizer tokenizer = new StringTokenizer(cleanInput);
        StringBuilder reversed = new StringBuilder();
        while (tokenizer.hasMoreTokens()){
            reversed.insert(0,tokenizer.nextToken());
        }
        if(cleanInput.equals(reversed.toString())){
            System.out.println("Palindrom");
        }
        else {
            System.out.println("Not palinndrom");
        }
    }
}
