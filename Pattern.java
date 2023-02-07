import java.util.Scanner;
public class Pattern {

    //if n = 16
    //output:- 16 11 6 1 -4 1 6 11 16

    public static void pattern(int n) {
        if(n <= 0) {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        pattern(n-5);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        pattern(n);
    }
}