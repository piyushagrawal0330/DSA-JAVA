

public class CalculatePower {
    static int calPow(int x,int n){
        if(x==0)
        return 0; 
        if(n==0)
        return 1;
        return x*calPow(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(calPow(2, 6
        ));
    }
}
