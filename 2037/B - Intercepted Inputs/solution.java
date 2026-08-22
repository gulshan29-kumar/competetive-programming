import java.util.*;
 
public class question {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
            }
            Arrays.sort(arr);
 
            int i=0;
            int j=a-1;
            int target=a-2;
            while (i<=j){
                int sum=arr[i]*arr[j];
                if(sum==target) break;
                else if(sum>target) j--;
                else i++;
            }
            System.out.println(arr[i]+" "+arr[j]);
        }
    }
}