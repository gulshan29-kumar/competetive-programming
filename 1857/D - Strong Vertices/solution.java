import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            long arr1[]=new long[a];
            for(int i=0;i<a;i++) arr1[i]=in.nextLong();
            long arr2[]=new long[a];
            long max=Integer.MIN_VALUE;
            for(int i=0;i<a;i++) {
                arr2[i]=in.nextLong();
                max=Math.max(max,arr1[i]-arr2[i]);
            }
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<a;i++){
                if(arr1[i]-arr2[i]==max){
                    arr.add(i+1);
                }
            }
            System.out.println(arr.size());
            for(int it:arr) System.out.print(it+" ");
            System.out.println();
 
        }
    }
}