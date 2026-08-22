import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            Character arr[][]=new Character[a][a];
            for(int i=0;i<a;i++){
                String str=in.next();
                for(int j=0;j<a;j++){
                    arr[i][j]=str.charAt(j);
                }
            }
            int ans=0;
            for(int i=0;i<a;i++){
                for(int j=0;j<a;j++){
                    int count0=0;
                    int count1=0;
                    if(arr[i][j]=='0') count0++;
                    else count1++;
                    if(arr[j][a-1-i]=='0') count0++;
                    else count1++;
                    if(arr[a-1-j][i]=='0') count0++;
                    else count1++;
                    if((arr[a-1-i][a-1-j])=='0') count0++;
                    else count1++;
                    if(count0==0||count1==0) continue;
                    if(count0>=count1){
                        ans+=count1;
                        arr[i][j]='0';
                        arr[j][a-1-i]='0';
                        arr[a-1-j][i]='0';
                        arr[a-1-i][a-1-j]='0';
 
                    }
                    else{
                        ans+=count0;
                        arr[i][j]='1';
                        arr[j][a-1-i]='1';
                        arr[a-1-j][i]='1';
                        arr[a-1-i][a-1-j]='1';
 
                    }
                }
 
            }
            System.out.println(ans);
 
        }
    }
}
 