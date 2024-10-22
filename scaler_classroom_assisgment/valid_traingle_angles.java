import java.util.Scanner;

public class valid_traingle_angles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        if (i+j+k==180){ 
            System.out.println("valid traingle angles");
        }else{
            System.out.println("invalid traingle angles");
        }
    }
}

