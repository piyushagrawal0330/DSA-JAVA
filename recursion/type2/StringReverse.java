public class StringReverse {
    static void reverse(String str,int n){
        if (n==0)
        return;
        System.out.print(str.charAt(n-1));
        reverse(str,n-1);
        

    }
    public static void main(String[] args) {
        String str= "abcd";
        int n=str.length();
        reverse(str,n);
    }
}
