public class mov_zer_end {
    public void mov_zero(int[] arr){
        int n =arr.length;
        int i=0;
        int j=0;
        while(j<n){
            if(arr[j]!=0){
                if(i!=j){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                } 
                i++;    
            }
            j++;

        }
    }
    public static void main(String[] args) {
        int[] a= {0,0,12,3,5,0,34,0,0,0,34,0};
        mov_zer_end m1 = new mov_zer_end();
        m1.mov_zero(a);
        int k=0;
        int n = a.length;
        while(k<n){
            System.out.print(a[k]+" ");
            k++;

        }

    }
}
