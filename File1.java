public class Missing_number_in_array{
// conflict attempt
    public static void main(String[] args) {
        int[] arr = {6,1,2,8,3,4,7,10,5};
        System.out.println(cyclic_sort(arr,9));
    }

    public static int cyclic_sort(int[] arr, int l){
        int i=0;
        while(i<l){
            if(arr[i]!=i+1){
                swap(arr, i, arr[i]);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<l;j++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return -1;
    }
    
    public static int[] swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second-2];
        arr[second-2]=temp;
        return arr;
    }
}