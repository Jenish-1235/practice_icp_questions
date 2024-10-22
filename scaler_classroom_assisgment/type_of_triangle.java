import java.util.Scanner;

public class type_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  i = sc.nextInt();
        int  j = sc.nextInt();
        int k = sc.nextInt();

        if (i == j && j == k) {
            System.out.println("Equilateral");
        }else if (i != j && j != k && i!=k) {
            System.out.println("Scalene");
        }else{
            System.out.println("isosceles");
        }

    }
}
