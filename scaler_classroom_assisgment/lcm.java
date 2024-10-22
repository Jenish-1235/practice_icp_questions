import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int I = sc.nextInt();
        int J = sc.nextInt();

        int i = I, j = J;
        while (j != 0){
            int temp = j;
            j = i % j;
            i = temp;
        }

        int gcd = i;

        int lcm = (I * J ) / gcd;
        System.out.println(lcm);
    }
}
