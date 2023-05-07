public class average {
    public static void main(String args[])
    {
        int[] arr= {16,12,29,16,20};
        int a = 0;

        for(int i =0; i<arr.length; i++){
            a = a + arr[i];
        }

        int average = a / arr.length;

        System.out.println ("The average is :"+average);
    }


}



