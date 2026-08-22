import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
 
            if (k == n * n - 1) {
                System.out.println("NO");
                continue;
            }
 
            char[][] arr = new char[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                   if(k-->0) arr[i][j]='U';
 
                   else if(i==n-1) {
                      if(j!=n-1) arr[i][j]='R';
                      else arr[i][j]='L';
                   }
                   else arr[i][j]='D';
                }
            }
            System.out.println("Yes");
          for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                  System.out.print(arr[i][j]);
              }
              System.out.println();
          }
        }
    }
}