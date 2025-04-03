
public class rem_duplicates {
    int removeDuplicates(int[] arr){
        int n = arr.length;
        int i=0;
        int j=1;
        while(j<n){
            if(arr[i]!=arr[j]){
            i++;
            arr[i]=arr[j];
            }   
            j++;
        }
        
        return i+1;
    }

    public static void main(String [] args){
        int a[]={2,10,20,20,20,40,50,50};
        rem_duplicates r1= new rem_duplicates();
        System.out.println(r1.removeDuplicates(a));
        int n1=a.length;
        for(int i=0;i<n1;i++)
        System.out.print(a[i]+",");
    }    
}
