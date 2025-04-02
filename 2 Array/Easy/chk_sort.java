public class chk_sort {

    boolean sorted(int[] arr){
        int n =arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;  
            }
            
        }
        return true;    
    }
    public static void main(String[] args){
        int a[]={10,20,30,15,40};
        chk_sort c1 = new chk_sort();
        if(c1.sorted(a)){
            System.out.println("yes");
        }
        else{
            System.err.println("No");
        }
    }

}
