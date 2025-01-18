public class StringToNumber {
    public static double toNum(String input){
        if(input.length()==1){
            return (input.charAt(0))-'0';
        }
        int ss=(input.charAt(0))-'0';
        return ss*Math.pow(10,input.length()-1)+toNum(input.substring(1));

    }
    public static void main(String[] args) {
        System.out.println(toNum("12324"));
    }
}
