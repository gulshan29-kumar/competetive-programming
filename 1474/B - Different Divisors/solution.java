import java.util.*;
public class qwe {
    public static void main(String[] args) {
        ArrayList<Integer> prime=new ArrayList<>();
        prime.add(1);
        for(int i=2;i<=Math.pow(10,5);i++){
            int bool=0;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    bool=1;break;
                }
            }
            if(bool==0) prime.add(i);
        }
      
    Scanner in=new Scanner(System.in);
    int t=in.nextInt();
    while(t-->0) {
     int d=in.nextInt();
     int p=Collections.binarySearch(prime,d+1);
     if(p<0) p=-p-1;
     int q=Collections.binarySearch(prime,prime.get(p)+d);
     if(q<0) q=-q-1;
     long p1=(long)prime.get(p);
     long q1=(long)prime.get(q);
     System.out.println(Math.min(p1*p1*p1,p1*q1));
    }
}}