import java.util.*;
public class qwe {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
           int a=in.nextInt();
           int b=in.nextInt();
           int freq[]=new int[50+1];
           Arrays.fill(freq,Integer.MAX_VALUE);
           int arr2[]=new int[b];
           for(int i=0;i<a;i++){
               int c=in.nextInt();
               freq[c]=Math.min(freq[c],i+1);
    }
           for(int i=0;i<b;i++) arr2[i]=in.nextInt();
           for(int i=0;i<b;i++){
               int idx=freq[arr2[i]];
               System.out.print(idx+" ");
               for(int j=0;j<51;j++){
                   if(freq[j]<idx) freq[j]++;
               }
               freq[arr2[i]]=1;
           }
           System.out.println();
 
    }
}