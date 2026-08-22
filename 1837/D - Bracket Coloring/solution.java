import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
           int a=in.nextInt();
           String str=in.next();
           if(a%2==1) {
               System.out.println(-1);
               continue;
           }
            int bool1=0;
           int bool2=0;
            int open=0;
            int close=0;
            ArrayList<Character> arr=new ArrayList<>();
           for(int i=0;i<a;i++){
              if(str.charAt(i)=='(') open++;
              else close++;
              if(i==0) {
                  if(close>open) {
                      arr.add('2');bool2=1;
                  }
                  else {
                      arr.add('1');bool1=1;
                  }
              }
              else if(open>close) {
                  bool1=1;arr.add('1');
              }
              else if(close>open) {
                  bool2=1;arr.add('2');
              }
              else arr.add(arr.get(arr.size()-1));
           }
           if(open!=close) System.out.println(-1);
           else if(bool1+bool2==1) {
               System.out.println(1);
               for(int i=0;i<a;i++){
                   System.out.print(1+" ");
               }
           }
           else {
               System.out.println(2);
               for(char ch:arr){
                   System.out.print(ch+" ");
               }
           }
            System.out.println();
        }
    }
}