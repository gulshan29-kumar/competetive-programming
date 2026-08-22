import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int arr[][]=new int[a][3];
		for(int i=0;i<a;i++){
		    arr[i][0]=in.nextInt();
		    arr[i][1]=in.nextInt();
		    arr[i][2]=i;
		}
      Arrays.sort(arr, (c, d) -> {
    if (c[1] != d[1]) 
        return Integer.compare(c[1], d[1]); // sort by second column (ascending)
    return Integer.compare(d[0], c[0]);     // if equal, sort first column descending
});
        int idx2=-1;
        int max=0;
        for(int i=1;i<a;i++){
            if(arr[i][0]<=arr[max][0]){
                idx2=arr[i][2];
                break;
            }
            if(arr[max][0]<=arr[i][0]) max=i;
        }
        if(idx2==-1) System.out.println(-1+" "+-1);
        else System.out.println((arr[max][2]+1)+" "+(idx2+1));
        
	}
}