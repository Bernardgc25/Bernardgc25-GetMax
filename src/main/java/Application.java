public class Application {
    public static void main(String[] args) {
        GetMax sample = new GetMax(); 
        int[] arr = {1,2,3,4};


        double maximum = sample.max(arr);
        
        System.out.println(maximum);
         

    }
}