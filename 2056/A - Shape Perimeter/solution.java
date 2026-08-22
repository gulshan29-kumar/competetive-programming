import java.util.*;
public class god {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int[][] arr=new int[a][2];
            for(int i=0;i<a;i++){
                for(int j=0;j<2;j++){
                    arr[i][j]=in.nextInt();
                }
            }
            int perimeter=0;
            if(a<=1) System.out.println(4*b);
            else{
            for(int i=0;i<a;i++){
                if(i==0) perimeter+=4*b-(2*b-arr[i+1][0]-arr[i+1][1]);
                else if(i==a-1) perimeter+=4*b-(2*b-arr[i][0]-arr[i][1]);
                else {
                    int d=2*b-(b-arr[i][0]+b-arr[i][1]);
                    int e=2*b-(2*b-arr[i+1][0]-arr[i+1][1]);
                    perimeter+=d+e;
                }
            }
            System.out.println(perimeter);}
 
        }
    }
 
}
 