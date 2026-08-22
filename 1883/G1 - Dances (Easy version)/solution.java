import java.util.*;
public class qwe{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            long arr1[]=new long[a];
            long arr2[]=new long[a];
            for(int i=0;i<a;i++) arr1[i]=in.nextLong();
            for(int i=0;i<a;i++) arr2[i]=in.nextLong();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int i=a-1;
            int j=a-1;
            int count=0;
            while(i>=0&&j>=0){
                if(arr1[i]<arr2[j]) {
                    count++;i--;j--;
                }
                else i--;
            }
            System.out.println(a-count);
        }
    }
}