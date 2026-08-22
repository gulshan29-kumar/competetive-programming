import java.util.*;
public class qwe{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int ans=0;
            for(int i=1;i<=10;i++){
                String str=in.next();
 
                for(int j=1;j<=10;j++){
                    if(str.charAt(j-1)=='X'){
                        if(i==1||j==1||j==10||i==10) ans+=1;
                        else if(i==2||j==2||j==9||i==9) ans+=2;
                        else if(i==3||j==3||j==8||i==8) ans+=3;
                        else if(i==4||j==4||j==7||i==7) ans+=4;
                        else ans+=5;
                    }
            }
        }
            System.out.println(ans);
    }
}}