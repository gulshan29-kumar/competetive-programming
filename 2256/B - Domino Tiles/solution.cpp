#include <bits/stdc++.h>
using namespace std;
int mod=998244353;
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0){
        int a;
        cin>>a;
        string str;
        cin>>str;
        bool even=false;
        bool odd=false;
        bool poss=false;
        int idx1=-1;
        int idx2=-1;
        for(int i=0;i<a;i++){
            if(i%2==0&&str[i]!='?'){
                even=true;
                idx1=i;
            }
            if(i%2==1&&str[i]!='?') {
                odd=true;
                idx2=i;
            }
        } 
        if(idx1!=-1){
            char ch=str[idx1];
            while(idx1>=0){
                if(str[idx1]==ch||str[idx1]=='?'){
                    idx1-=2;
                   ch = (ch == '0' ? '1' : '0');
                    continue;
                }
                else {
                    poss=true;
                    break;
                }
            }
        }
        if(idx2!=-1){
            char ch=str[idx2];
            while(idx2>=0){
                if(str[idx2]==ch||str[idx2]=='?'){
                    idx2-=2;
                    ch = (ch == '0' ? '1' : '0');
                    continue;
                }
                else {
                    poss=true;
                    break;
                }
            }
        }
        
        if(poss) cout<<0<<endl;
        else if(even&&odd) cout<<1<<endl;
        else if(even||odd) cout<<2<<endl;
        else cout<<4<<endl;
        
	}
 
}