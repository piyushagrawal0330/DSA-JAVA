public class PlaceTiles {
    public static int placeTiles(int m ,int n){
        if(m>n)return 1;
        if(m==n)return 2;
        
        int horPlacements=placeTiles(m,n-1
        );
        int verPlacements=placeTiles(m,n-m);
        return horPlacements+verPlacements;

    }
    public static void main(String[] args) {
        int m=2;
        int n=4;
        int ans = placeTiles(m,n);
        System.out.println(ans);
    }
}
