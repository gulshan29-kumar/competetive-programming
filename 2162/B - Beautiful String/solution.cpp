#include <bits/stdc++.h>
 
using namespace std;
 
int main() {
    // your code goes here
    int t;
    cin >> t;
    while (t--> 0) {
        int a;
        cin >> a;
        string str;
        cin >> str;
        int cnt=0;
        for(int i=0;i<a;i++){
            if(str[i]=='1') cnt++;
        }
     if(cnt==a){
         cout<<0<<endl;
         continue;
     }
        
      cout<<cnt<<endl;
      for(int i=0;i<a;i++){
          if(str[i]=='1') cout<<i+1<<" ";
      }
      cout<<endl;
    }
 
}