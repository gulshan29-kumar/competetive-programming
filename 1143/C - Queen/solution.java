import java.util.*;
 
public class god {
    static List<Integer> list;
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      ArrayList<Integer> adj[]=new ArrayList[a];
        for(int i=0;i<a;i++){
            adj[i] = new ArrayList<>();
        }
      list=new ArrayList<>();
      int col[]=new int[a];
      int head=0;
      for(int i=0;i<a;i++){
          int parent=in.nextInt();
          int col1=in.nextInt();
         if(parent!=-1){
          adj[parent-1].add(i);
          col[i]=col1;}
         else head=i;
      }
      for(int i=0;i<a;i++){
         if(col[i]==1&&i!=head){
             Boolean bool=true;
             for(int j=0;j<adj[i].size();j++){
                 if(col[adj[i].get(j)]!=1){
                     bool=false;
                     break;
                 }
             }
             if(bool) list.add(i);
         }
      }
      if(list.size()==0) System.out.print(-1);
      else for(int it:list) System.out.print((it+1)+" ");
      System.out.println();
    }
 
}
 