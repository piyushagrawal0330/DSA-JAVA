public class printNumbers5to1{
    public static void main(String[] args) {
        recursionReverse(10);
    }
    static void numbers(int n){
        for(int i =n; i>0;i--){
            System.out.println(i);
        }
    }
    static void recursionReverse(int n){
        if(n ==0)
        return ;
        System.out.println(n);
        recursionReverse(n-1);

    }
}