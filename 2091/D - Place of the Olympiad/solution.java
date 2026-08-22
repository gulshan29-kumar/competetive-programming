import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long row=in.nextLong();
            long col=in.nextLong();
            long target=in.nextLong();
            long low=1;
            long high=col;
            long ans=col;
            while(low<=high){
                long mid=(low+high)/2;
                long cap=(col-(col/(mid+1)))*row;
                if(cap>=target){
                    ans=mid;
                    high=mid-1;
                }
                else low=mid+1;
            }
            System.out.println(ans);
 
        }
    }
}