import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
          int a=in.nextInt();
          int arr[]=new int[a];
          for(int i=0;i<a;i++) arr[i]=in.nextInt();
          int arr1[][]=new int[a][2];
          for(int i=0;i<a;i++){
              arr1[i][0]=arr[i];
              arr1[i][1]=i;
          }
            Arrays.sort(arr1, (c, d) -> Integer.compare(c[0], d[0]));
            int ans[]=new int[a+1];
            ans[0]=0;
            long maxans=0;
            int ele=1;
            if(a%2!=0){
            for(int i=a-1;i>=0;i--){
                if(i%2==0){
                    ans[arr1[i][1]+1]=ele;
                    maxans=maxans+(long)2*arr1[i][0]*(ele);
                }
                else{
                    ans[arr1[i][1]+1]=-ele;
                    maxans=maxans+(long)2*arr1[i][0]*(ele);
                    ele++;
                }
            }}
            else{
                for(int i=a-1;i>=0;i--){
                    if(i%2!=0){
                        ans[arr1[i][1]+1]=ele;
                        maxans+=2L*arr1[i][0]*(ele);
                    }
                    else{
                        ans[arr1[i][1]+1]=-ele;
                        maxans+=2L*arr1[i][0]*(ele);
                        ele++;
                    }
                }
 
            }
            System.out.println(maxans);
            for(int it:ans) System.out.print(it+" ");
            System.out.println();
 
        }
    }
}