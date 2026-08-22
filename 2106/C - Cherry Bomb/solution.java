import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
           int a=in.nextInt();
           int b=in.nextInt();
           int[] arr1=new int[a];
           int[] arr2=new int[a];
           for(int i=0;i<a;i++){
               arr1[i]=in.nextInt();
           }
            for(int i=0;i<a;i++){
                arr2[i]=in.nextInt();
            }
            int boo=-1;
            int bool=0;
            for(int i=0;i<a;i++){
                if(arr2[i]!=-1&&boo==-1){
                    boo=arr1[i]+arr2[i];
                }
                else if(arr2[i]!=-1&&boo!=arr2[i]+arr1[i]){
                    bool=1;
                    break;
                }
            }
            if(bool==1) System.out.println(0);
            else {
                Arrays.sort(arr1) ;
                if(boo==-1&&arr1[0]+b>=arr1[a-1]){
                    System.out.println(arr1[0]+b-arr1[a-1]+1);
                }
                else if(boo!=-1&&arr1[0]+b>=boo&&arr1[a-1]<=boo){
                    System.out.println(1);
                }
                else System.out.println(0);
            }
        }
    }
}