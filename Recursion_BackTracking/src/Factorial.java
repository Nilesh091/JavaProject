public class Factorial {
    public  int factorial(int a){
        if(a<=2){
            return a;
        }
        return a*factorial(a-1);
    }
}
