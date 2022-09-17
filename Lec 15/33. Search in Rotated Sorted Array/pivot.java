class pivot {
    public static void main(String[] args) {
        int value = search();
        System.out.println(value);
        }
        static int search(){
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0, index = 0, pivot = 0;
        pivot = findPivot(arr);
        if(arr[pivot] == target) return pivot;
        if(pivot == -1) return binarySearch(arr, 0, arr.length-1, target);
        index = binarySearch(arr, 0, pivot-1, target);
        if(index==-1) return binarySearch(arr, pivot+1, arr.length-1, target);
        return index;
        }
        

  static int findPivot(int[] arr){
       int start = 0;
       int end = arr.length - 1;
       while(start <= end){
           int mid = start + (end - start) / 2;
           if(mid<end && arr[mid] > arr[mid+1]) return mid;
           if(mid > start && arr[mid-1] > arr[mid]) return mid - 1;
           if(arr[start] >= arr[mid]) end = mid - 1;
           else start = mid + 1;
       }
       return -1;
    }
    
static int binarySearch(int[] arr, int start, int end, int target) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target==arr[mid]) return mid;
            if(target < arr[mid]) end = mid - 1;
            else if(target > arr[mid]) start = mid + 1;
        }
        return -1;
    }
}