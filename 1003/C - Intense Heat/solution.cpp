#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int a,b;
	cin>>a>>b;
	long double arr[a];
	for(int i=0;i<a;i++) cin>>arr[i];
	long double maxi=0;
	  for(int i=0;i<a;i++){
	      long double sum=0;
	    for(int j=i;j<a;j++){
	        sum+=arr[j];
	        int len=j-i+1;
	        if(len>=b) maxi=max(maxi,sum/len);
	    }
	}
   cout<<fixed<<setprecision(10)<<maxi<<endl;
}