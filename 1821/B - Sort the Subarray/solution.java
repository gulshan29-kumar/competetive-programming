import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr1[]=new int[a];
            for(int i=0;i<a;i++){
                arr1[i]=in.nextInt();
            }
            int arr2[]=new int[a];
            for(int i=0;i<a;i++){
                arr2[i]=in.nextInt();
            }
            int i=0;int idx1=0;int j=0;
            while(i<a){
                idx1=i;
                if(arr1[i++]!=arr2[j++]) {
                    break;
                }
            }
            i=a-1;j=a-1;int idx2=a-1;
            while(i>=0){
                idx2=i;
                if(arr1[i--]!=arr2[j--]){
                    break;
                }
            }
            while(idx1>0&&arr2[idx1-1]<=arr2[idx1]) idx1--;
            while(idx2<a-1&&arr2[idx2+1]>=arr2[idx2]) idx2++;
            System.out.println((idx1+1)+" "+(idx2+1));
        }
    }
}