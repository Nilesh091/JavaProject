// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static boolean check(int s){
        ArrayList<Integer> ele=new ArrayList<Integer>();
        ArrayList<Integer> frq=new ArrayList<Integer>();

    }
    public static void main(String[] args) {
//        // Press Opt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//
//        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Ctrl+D to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Cmd+F8.
//            System.out.println("i = " + i);
        //}
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements that you want to enter: ");
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int j=0;j<n;j++){
            if(check(arr[j]))
        }

    }
}