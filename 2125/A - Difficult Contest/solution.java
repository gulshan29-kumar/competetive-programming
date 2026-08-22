import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
 
        while (t-- > 0) {
            String s = in.nextLine();
            StringBuilder mid = new StringBuilder();
            int countF = 0, countN = 0;
 
            for (char c : s.toCharArray()) {
                if (c == 'F') countF++;
                else if (c == 'N') countN++;
                else mid.append(c);
            }
 
            // Append all 'F's and 'N's at the end
            for (int i = 0; i < countF; i++) mid.append('F');
            for (int i = 0; i < countN; i++) mid.append('N');
 
            System.out.println(mid);
        }
    }
}