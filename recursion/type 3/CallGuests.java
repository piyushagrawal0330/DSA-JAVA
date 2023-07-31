public class CallGuests {
    static int callGuests(int n){
        if(n<=1) return 1;
        // single aaya toh
        int single = callGuests(n-1);
        // pair mai aaya
        int pair = (n-1)*callGuests(n-2);
        return single + pair;
    }
    public static void main(String[] args) {
        int ans = callGuests(4);
        System.out.println(ans);
    }
}
