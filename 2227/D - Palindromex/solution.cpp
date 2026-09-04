#include <bits/stdc++.h>
using namespace std;
int n;
int solve(int i,int j,int arr[]){
    set<int> set1;
    for(int i=0;i<=n;i++) set1.insert(i);
    while(i>=0&&j<2*n&&arr[i]==arr[j]){
        set1.erase(arr[i]);
        i--;
        j++;
    }
    return *set1.begin();
}
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
	    cin>>n;
	    int arr[2*n];
	    int x=-1;
	    int y=-1;
	    for(int i=0;i<2*n;i++){
	        cin>>arr[i];
	        if(arr[i]==0){
	            if(x==-1) x=i;
	            else y=i;
	        }
	    }
        cout<<max(solve(x,x,arr),max(solve(y,y,arr),solve((x+y)/2,(x+y+1)/2,arr)))<<endl;
	}
 
}