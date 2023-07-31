public class firstAndLastOccurance {
    public static int first=-1;
    public static int last=-1;
    public static void findOccurance(String str,int idx,char element){
        char currChar =str.charAt(idx);
        if(idx ==str.length()-1){
            System.out.println(first);
            System.err.println(last);
            return;
        }
        if(currChar == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findOccurance(str,idx+1,element);

    }
      
    public static void main(String[] args) {
        
       String str = "abaacdaefaah";
        findOccurance(str,0,'a' );
       
    }
    
    
}
