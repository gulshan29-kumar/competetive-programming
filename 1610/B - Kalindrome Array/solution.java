import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
          int a=in.nextInt();
          int arr[]=new int[a];
          for(int i=0;i<a;i++) arr[i]=in.nextInt();
          int i=0;int j=a-1;
          Boolean bool=true;
          int min=-1;
          while(i<j){
              if(arr[i]==arr[j]){
                  i++;j--;
              }
              if(arr[i]==min){
                  i++;continue;
              }
              if(arr[j]==min){
                  j--;continue;
              }
              if(arr[i]!=arr[j]) {
                  if(min==-1) min=arr[i];
                  else {bool=false;
                      break;
                  }
              }
 
          }i=0;j=a-1;
            Boolean bool1=true;
            int min1=-1;
            while(i<j){
                if(arr[i]==arr[j]){
                    i++;j--;
                }
                if(arr[i]==min1){
                    i++;continue;
                }
                if(arr[j]==min1){
                    j--;continue;
                }
                if(arr[i]!=arr[j]) {
                    if(min1==-1) min1=arr[j];
                    else {bool1=false;
                        break;
                    }
                }
 
            }
          if(bool||bool1) System.out.println("Yes");
          else System.out.println("No");
 
 
        }
    }
}