#include <bits/stdc++.h>
using namespace std;
long long arr[200000+1];
int s(int i){
    int sum=0;
    while(i!=0){
        sum+=i%10;
        i/=10;
    }
    return sum;
}
void func(){
    arr[0]=0;
    for(int i=1;i<=200000;i++){
        arr[i]=arr[i-1]+s(i);
    }
}
int main() {
	// your code goes here
	int t;
	cin>>t;
	func();
	while(t--){
	   int a;
	   cin>>a;
	  cout<<arr[a]<<endl;
	}
 
}