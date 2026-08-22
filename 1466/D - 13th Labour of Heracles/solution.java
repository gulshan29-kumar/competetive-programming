import java.util.*;
import java.io.*;
 
public class Codechef {
    static ArrayList<Integer>[] list;
    static List<Long> lista;
    static long[] weight;
 
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            int n = in.nextInt();
 
            weight = new long[n];
            long sum = 0;
 
            for (int i = 0; i < n; i++) {
                weight[i] = in.nextLong();
                sum += weight[i];
            }
 
            list = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                list[i] = new ArrayList<>();
            }
 
            for (int i = 0; i < n - 1; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
 
                list[u].add(v);
                list[v].add(u);
            }
 
            lista = new ArrayList<>();
 
            dfs(0, -1);  
 
            Collections.sort(lista, Collections.reverseOrder());
 
            System.out.print(sum + " ");
 
            for (int i = 0; i < lista.size(); i++) {
                sum += lista.get(i);
                System.out.print(sum + " ");
            }
 
            System.out.println();
        }
    }
 
    static void dfs(int node, int parent) {
        int deg = list[node].size();
        for (int i = 1; i < deg; i++) {
            lista.add(weight[node]);
        }
 
        for (int child : list[node]) {
            if (child != parent) {
                dfs(child, node);
            }
        }
    }
}