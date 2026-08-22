import java.util.*;
public class qwe{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int possum=0;
            int negsum=0;
            for(int i=1;i<=a-1;i++){
                int c=in.nextInt();
                if(c<0) {
                    negsum+=(-1)*c;
                }
                else possum+=c;
            }
            System.out.println(-1*(possum-negsum));
        }
    }
}