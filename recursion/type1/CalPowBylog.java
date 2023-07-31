public class CalPowBylog {
    static int calPow(int x,int n){
        if(x==0)
        return 0;
        if(n==0)
        return 1;
        // if n is even
        if(n%2==0){
            return calPow(x, n/2)*calPow(x, n/2);
        }
        else{//if n is odd
            return calPow(x, n/2)*calPow(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        System.out.println(calPow(2, 6
        ));
    }
}
