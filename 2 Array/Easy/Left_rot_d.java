
public class Left_rot_d {
    void rotate_d(int[] arr, int d){
        int n= arr.length;
        int rot=d%n;
        
        int i=0;
        while(i<rot){
            int first=arr[0];
            for(int j=1;j<n;j++){
                arr[j-1]=arr[j];
            }
            arr[n-1]=first;
            i++;
        }

    }
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        Left_rot_d r1 = new Left_rot_d();
        r1.rotate_d(a, 2);
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }


        
    }
    
}
