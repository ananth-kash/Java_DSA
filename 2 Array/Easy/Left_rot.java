

public class Left_rot {
    public void lrot(int[]arr){
        int first= arr[0];
        int i=1;
        int n=arr.length-1;
        if(n>1){
            while(i<n){
                arr[i-1]=arr[i];
                i++;
            }
            arr[n]=first;
        }
    }
    public static void main(String[] args){
        int[]a= {10,30,40,45};
        Left_rot r1 = new Left_rot();
        r1.lrot(a);
        int len=a.length;
        for(int i=0;i<len;i++){
            System.out.print(a[i]+" ");
        }   
    }

}
