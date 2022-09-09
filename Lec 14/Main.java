class Main{
    public static void main(String args[]){
        int[] arr = {2, 4, 6, 8, 10};
        int target = 8;
        int index = binarySearch(arr, target);
        System.out.println(index);
    }
   static int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length - 1, mid = 0;
        while(true){
            mid = (int)(start + end) / 2;
            if(arr[mid] == target){
                return mid;
            } 
            if(target > arr[mid]){
                start = mid + 1;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else System.out.println("Error!");
        }
    }
}