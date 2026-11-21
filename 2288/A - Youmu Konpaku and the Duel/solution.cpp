#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int a;
        cin>>a;
        int ans=a;
        for(int i=1;i<=a;i++){
            if(i*(i+1)/2>=a){
                ans=min(ans,i-1+(int)ceil(((2*i+1)-sqrt((2*i+1)*(2*i+1)-8*a))/2.0));
            }
        }
        cout<<ans<<endl;
    }
}