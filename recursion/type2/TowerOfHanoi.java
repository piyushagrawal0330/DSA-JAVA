public class TowerOfHanoi {
    static void towerOfHanoi(int n, String src ,String hel, String dest){
        if(n==1){
            System.out.println("transfer disk from "+n + " from "+src +" to "+ dest);
            return;
        }
        towerOfHanoi(n-1, src,dest,hel);
            System.out.println("transfer disk from "+n + " from "+src +" to "+ dest);
    
        towerOfHanoi(n-1,hel,src,dest);
    
    }
    public static void main(String[] args) {
        int n=3;
        towerOfHanoi(n,"s","h","d");
    }
}
