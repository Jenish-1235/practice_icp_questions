import java.util.Scanner;

public class palindromic_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = n;
        int rNumber = 0;

        while(n != 0){
            int remainder = n% 10;
            rNumber = rNumber * 10 + remainder;
            n = n/10;
        }

        while (rNumber!=0) {
            
            if (m%10 == rNumber%10) {
                m = m/10;
                rNumber = rNumber/10;
            }else{
                System.out.println("Not Palindromic");
                break;
            }
        }

        if (m == 0) {
            System.out.println("Palindromic");
        }
    }
}
