import java.io.*;
import java.util.*;
 
        public class question {
            public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int t = Integer.parseInt(br.readLine().trim()); // Number of test cases
 
                while (t-- > 0) {
                    long a = Long.parseLong(br.readLine().trim());
                    long renew=0;
                    for(int i=1;i<=a;i++){
                        if(a%i==0) renew++;
                        else break;
                    }
                    System.out.println(renew);
                }
            }
        }
 