
class bubbleSort {

    void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String[] args){
       int[] a={10,20,2,333,31,45,4,3};
        bubbleSort sorter = new bubbleSort();
        sorter.sort(a);
        System.out.println(java.util.Arrays.toString(a));

    }
    
}
