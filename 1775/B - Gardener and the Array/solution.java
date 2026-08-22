import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
              int a=in.nextInt();
              ArrayList<Integer>[] arr=new ArrayList[a];
              Map<Integer,Integer> map=new HashMap<>();
              for(int i=0;i<a;i++){
                  int c=in.nextInt();
                  arr[i]=new ArrayList<>();
                  for(int j=0;j<c;j++){
                      arr[i].add(in.nextInt());
                      map.put(arr[i].get(j), map.getOrDefault(arr[i].get(j),0)+1);
                  }
              }
              int boo=0;
              for(int i=0;i<a;i++){
                  Boolean bool=true;
                  for(int j=0;j<arr[i].size();j++){
                      if(map.get(arr[i].get(j))<=1) {
                          bool=false;
                          break;
                      }
                  }
                  if(bool){
                      boo=1;
                      break;
                  }
              }
              if(boo==1) System.out.println("Yes");
              else System.out.println("No");
        }
    }
}