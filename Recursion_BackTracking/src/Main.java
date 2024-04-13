import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        Factorial obj=new Factorial();
        System.out.println(obj.factorial(n));
        Fibonacci f=new Fibonacci();
        System.out.println(f.fibonacci(n));
        Sum s=new Sum();
        System.out.println(s.sum(n));
    }
}