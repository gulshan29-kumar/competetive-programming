import java.util.*;
 
public class qwe {
    static int a;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            a=in.nextInt();
            long arr[][]=new long[a][2];
            for(int i=0;i<a;i++){
                arr[i][0]=in.nextLong();
                arr[i][1]=in.nextLong();
            }
            Arrays.sort(arr,(c,d) ->Long.compare(c[0],d[0]));
            long arr1[]=new long[a];
            for(int i=0;i<a;i++){
                arr1[i]=arr[i][1];
            }
            long ans=countinver(arr1,0,a-1);
            System.out.println(ans);
        }
    }
    static long countinver(long arr[],int left,int right){
        if(left>=right) return 0;
        int mid=left+(right-left)/2;
        long count=0;
        count+=countinver(arr,left,mid);
        count+=countinver(arr,mid+1,right);
        count+=merge(arr,left,mid,right);
        return count;
    }
    static long merge(long arr[],int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        long arr1[]=new long[n1];
        long arr2[]=new long[n2];
        for(int i=0;i<n1;i++){
            arr1[i]=arr[left+i];
        }
        for(int i=0;i<n2;i++){
            arr2[i]=arr[mid+i+1];
        }
        long countinverstion=0;
        int i=0;
        int j=0;
        int k=left;
        while(i<n1&&j<n2){
            if(arr1[i]<=arr2[j]){
                arr[k++]=arr1[i++];
 
            }
            else{
                countinverstion+=(n1-i);
                arr[k++]=arr2[j++];
 
            }
        }
        while(i<n1){
            arr[k++]=arr1[i++];
        }
        while(j<n2){
            arr[k++]=arr2[j++];
        }
        return countinverstion;
    }
}