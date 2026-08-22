import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int arr[] = new int[a];
 
            // store indices of each number
            Map<Integer, List<Integer>> indexMap = new HashMap<>();
            for (int i = 0; i < a; i++) {
                arr[i] = in.nextInt();
                indexMap.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
            }
 
            boolean ok = true;
            int[] ansArr = new int[a];
            int groupId = 1;
 
            // process each distinct number
            for (int num : indexMap.keySet()) {
                List<Integer> indices = indexMap.get(num);
                int count = indices.size();
 
                if (count % num != 0) {
                    ok = false;
                    break;
                }
 
                // partition indices into groups of size = num
                for (int i = 0; i < count; i += num) {
                    for (int j = 0; j < num; j++) {
                        ansArr[indices.get(i + j)] = groupId;
                    }
                    groupId++;
                }
            }
 
            if (!ok) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < a; i++) {
                    System.out.print(ansArr[i] + " ");
                }
                System.out.println();
            }
        }
    }
}