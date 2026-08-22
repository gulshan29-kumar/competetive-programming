import java.util.*;
import java.lang.*;
import java.io.*;
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		if(!in.hasNextInt()) return;
		
		int n = in.nextInt();
		
		int arr[][] = new int[2*n][2];
		
		int idx = 0;
		for(int i=0;i<n;i++){
		    int l = in.nextInt();
		    int r = in.nextInt();
		    
		    arr[idx][0] = l;
		    arr[idx][1] = 1;
		    idx++;
		    
		    arr[idx][0] = r+1;
		    arr[idx][1] = -1;
		    idx++;
		}
		
		Arrays.sort(arr, new Comparator<int[]>(){
		    public int compare(int a[], int b[]){
		        if(a[0] != b[0]) return a[0] - b[0];
		        return a[1] - b[1];
		    }
		});
		
		int active = 0;
		
		for(int i=0;i<2*n;i++){
		    active += arr[i][1];
		    
		    if(active > 2){
		        System.out.println("NO");
		        return;
		    }
		}
		
		System.out.println("YES");
	}
}