import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int arr[]=new int[a];
            HashMap<Integer,Integer> map=new HashMap<>();
            int count=0;
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
                if(arr[i]%2!=0) count++;
                map.put(i+1,count);
            }
            while(b-->0){
                int max=0;
                int j=in.nextInt();
                int k=in.nextInt();
                int l=in.nextInt();
                if(j==1&&l%2!=0) {
                   max=count+k-map.get(k);
            }
                else if(l%2!=0){
                    max=count+(k-j+1)-(map.get(k)-map.get(j-1));
                }
                else if(j==1&&l%2==0){
                    max=count-map.get(k);
                }
                else {
                    max=count-(map.get(k)-map.get(j-1));
                }
                if(max%2!=0) System.out.println("Yes");
                else System.out.println("No");
        }
        }
    }
}