import java.util.Scanner;

public class print_n_numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n ; i++){
            System.out.print(i + " ");
        }
    }
}