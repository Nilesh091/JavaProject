import java.util.*;

public class MaximumOftwoNumbers {
    public static void max() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        a=(b>a) ?b:a;
//        a=(c>a)?c:a;
        int x=(a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(x);
    }

}
