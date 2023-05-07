public class linearSearching {
    public static void main(String[] args) {
        
// search in the array : return the index if item found;
// otherwise if item not found return -1;



    }

    static int linearSearching1(int [] arr, int target){
        if(arr.length ==0){
            return -1;
        }
        
    for(int index = 0;index< arr.length; index++){
        int element = arr[index];
        if(element == target){
            return index;
        }
    }
    return target;


    }
}
