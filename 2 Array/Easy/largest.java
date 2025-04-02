public class largest {

    
    public int maxNum(int arr[]){
        int maxIndex=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
                if(arr[maxIndex]<arr[i]){
                    maxIndex=i;
            }
        
        }
        return arr[maxIndex];
    }
    public static void main(String[] args){

        int[] a={10,20,40,30};
        largest m = new largest();
        System.out.println(m.maxNum(a));
        
    }
    
}
