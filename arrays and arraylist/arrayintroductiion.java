class Main {
    public static void main(String[] args) {
        // Q store a rollno
        int a =19;
        
        // store a person name
        String name="piyush";

        //Q to store a 5 roll no -->for this we require datatype like array

        // syntax of array
        // datatype[] variable_name = new datatype[size];
        int[] rnos = new int[5];
        // or directly
        int[] rnos2 = {23,12,14,115,3};
        // breakdown

        int[] ros; //declaration of arrsy ros is getting defined in the stack
        ros = new int[5];// initialization: actual here object is being created in th memory(heap)
        // System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}
