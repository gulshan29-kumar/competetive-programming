#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int a,b,c;
        cin>>a>>b>>c;
        string str;
        cin>>str;
        int ans=a+b;
        for(int i=0;i<c;i++){
            if(str[i]=='+'){
                if(b>=1) b++;
                else {
                    if(a>=1) {b++;a--;}
                    else break;
                }
            }
            else{
                if(b>=2) {
                    a++;
                    b--;
                }
                else if(a>=1){
                    a--;
                }
                else{
                    if(b==1) {
                        b--;
                        a++;
                    }
                    else break;
                    
                }
            }ans=max(ans,a+b);
        }
        cout<<ans<<endl;
    }
}