import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int a = A, b = B;

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println(a);
    }
}
