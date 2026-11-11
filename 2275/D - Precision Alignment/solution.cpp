#include<bits/stdc++.h>
using namespace std;
typedef long long L;
int main(){
    int t,n;
    L k,a,b,c;
    cin>>t;
    while(t--){
        cin>>n>>k;
        vector<L>s(n),m(n);
        L lo=4e18,h=2e18;
        for(int i=0;i<n;i++){
            cin>>a>>b>>c;
            s[i]=a+b+c;
            m[i]=a>b||b>c?0:a==c?-1:min(b-a+1,c-b+1)*2;
            lo=min(lo,s[i]);
        }
        while(lo<h){
            L M=lo+(h-lo+1)/2,T=0;
            for(int i=0;i<n&&T<=k;i++)
            if(M>s[i])T+=m[i]<0?4e18:M-s[i]+m[i];
            if(T<=k)lo=M;
            else h=M-1;
        }
        cout<<lo<<"
";
    }
}