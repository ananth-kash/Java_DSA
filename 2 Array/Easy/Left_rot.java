<<<<<<< HEAD


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
=======


public class Left_rot {
    public void lrot(int[]arr){
        int first= arr[0];
        int i=1;
        int n=arr.length-1;
        if(n>1){
            int last =arr[n];
            while(i<n){
                arr[i-1]=arr[i];
                i++;
            }
            arr[n-1]=last;
            arr[n]=first;
        }
    }
    public static void main(String[] args){
        int[]a= {10};
        Left_rot r1 = new Left_rot();
        r1.lrot(a);
        int len=a.length;
        for(int i=0;i<len;i++){
            System.out.print(a[i]+" ");
        }   
    }

}
>>>>>>> 76cf465ae1d041780e73e7e4df0b1c9ea2f9b526
