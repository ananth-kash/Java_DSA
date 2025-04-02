public class Sec_largest {
    int findSeclargest(int[] arr){
        int n= arr.length;
        if(n<2){
            System.out.println("Not enough elements exist in the array");
            return -1;
        }
        int firstMax=0;
        int SecondMax=0;
        
        for(int i=1;i<n;i++){
            if(arr[i]>arr[firstMax]){
                SecondMax=firstMax;
                firstMax=i;
            }
            else if((arr[i]>arr[SecondMax])&& i!=firstMax){
                SecondMax=i;
            }

        }
        return arr[SecondMax];
    }

    public static void main(String[] args){
        Sec_largest s1 = new Sec_largest();
        int[] a = {30, 200, 150, 45, 23};
        System.out.println(s1.findSeclargest(a));
    }
}

