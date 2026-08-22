import java.util.*;
 
public class question{
    public static void main(String[] args) {
 
 
        Scanner in=new Scanner(System.in);
        int arr[][]=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=in.nextInt();
            }
        }
            int idx1=-1;
            int idx2=-1;
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                  if(arr[i][j]==1)   {
                      idx1=i;
                      idx2=j;
                      break;
                  }
                }
        }
            System.out.println(Math.abs(2-idx1)+Math.abs(2-idx2));
    }
}