import java.util.*;
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            long arr[]=new long[a];
            for(int i=0;i<a;i++) arr[i]=in.nextLong()%b;
 
            Arrays.sort(arr);
            int i=0;
            while(i<a&&arr[i]==0) i++;
            int count=0;
            int j=a-1; if(i!=0) count=1;
 
            while(i<=j){
 
                long sum = arr[i] + arr[j];
 
                if(sum == b){
                    int count1 = 1;
                    int count0 = 1;
 
                    while(i < a-1 && arr[i] == arr[i+1]) {
                        count1++;
                        i++;
                    }
                    while(j > 0 && arr[j] == arr[j-1]) {
                        count0++;
                        j--;
                    }
 
                    count1 = Math.max(count0,count1)-(Math.min(count0,count1)+1);
 
                    if(count1 <= 0) count++;
                    else count += 1 + count1;
 
                    i++;
                    j--;
                }
                else if(sum > b){
                    j--;
                    count++;
                }
                else {
                    i++;
                    count++;
                }
            }
 
            System.out.println(count);
        }
    }
}