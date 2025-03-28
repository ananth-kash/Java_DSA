class selectionSort{

    public void sort(int[] arr){
        int n =arr.length;
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for (int j=i;j<n;j++){
                if(arr[minindex]>arr[j]){
                    minindex=j;
                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;

        }
    }
    public static void main(String[] args){
        int[] a={65,323,23,23,55,3,5};
        selectionSort sorter = new selectionSort();
        sorter.sort(a);
        System.out.println(java.util.Arrays.toString(a));        
       
    }
}
