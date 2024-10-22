import java.util.Scanner;

public class classify_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 0) {
            System.out.println("zero");
        }else if (i > 0) {
            if (i % 2 == 0) {
                System.out.println("Even - Positive");
            }else{
                System.out.println("Odd - Positive");
            }
        }else{
            if (i%2 == 0) {
                System.out.println("Even - Negative");
            }else{
                System.out.println("Odd - Negative");
            }
        }
    }
}
