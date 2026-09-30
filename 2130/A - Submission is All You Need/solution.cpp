#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int a;
        cin>>a;
        int sum=0;
        for(int i=0;i<a;i++){
            int d;
            cin>>d;
            sum+=d;
            if(d==0) sum++;
        }
        cout<<sum<<endl;
    }
}
 