import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt()-a;
            int d=in.nextInt()-b;
            Boolean bo=true;
            if(a>b){
                if(a%2==0){
                    if(b<a/2-1) bo=false;
                }
                else {
                    if(b<a/2) bo=false;
                }
            }else {
                if(b%2==0){
                    if(a<b/2-1) bo=false;
                }
                else {
                    if(a<b/2) bo=false;
                }
            }
            if(c>d){
                if(c%2==0){
                    if(d<c/2-1) bo=false;
                }
                else {
                    if(d<c/2) bo=false;
                }
            }
            else {
                if(d%2==0){
                if(c<d/2-1) bo=false;
            }
            else {
                if(c<d/2) bo=false;
            }
 
 
            }
            if(bo) System.out.println("Yes");
            else System.out.println("No");
 
 
        }
    }
}