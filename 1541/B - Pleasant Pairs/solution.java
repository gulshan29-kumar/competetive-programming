import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[][]=new int[a][2];
            for(int i=0;i<a;i++){
                arr[i][0]=in.nextInt();
                arr[i][1]=i+1;
            }
            Arrays.sort(arr,(c,d)-> Integer.compare(c[0],d[0]));
            int count=0;
            for(int i=0;i<a;i++){
                if(i<a-1) if(arr[i][0]*arr[i+1][0]>=2*a) break;
                for(int j=i+1;j<a;j++){
                    if(arr[i][0]*arr[i][0]>=2*a) break;
                    if(arr[i][0]*arr[j][0]==arr[i][1]+arr[j][1]){
                        count++;
                    }
                }
            }
            System.out.println(count);
 
        }
    }
}