import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int arr1[] = new int[a];
            int arr2[] = new int[a];
            int xore=0;
            int xoro=0;
            for (int i = 0; i < a; i++) {
                arr1[i] = in.nextInt();
                xore^=arr1[i];
            }
            for (int i = 0; i < a; i++) {
                arr2[i] = in.nextInt();
                xoro^=arr2[i];
 
            }
            int idx=-1;
            for(int i=a-1;i>=0;i--){
                if(arr1[i]!=arr2[i]) {
                    idx=i;break;
                }
            }
          if(xore==xoro) System.out.println("Tie");
          else{
              if(idx%2!=0) System.out.println("Mai");
              else System.out.println("Ajisai");
          }
        }
    }
}