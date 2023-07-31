public class CountPaths {

    public static int countPaths(int i, int j , int m , int n){
        if(i==m||j==n)return 0;
        if(i==m-1&&j==n-1)return 1;
        int downpaths = countPaths(i, j+1, m, n);
        int rightpaths = countPaths(i+1, j, m, n);
        return downpaths+rightpaths;
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println(countPaths(0, 0, m, n)); 
    }
}
