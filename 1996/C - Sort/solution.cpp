#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
      int a,b;
      cin>>a>>b;
      string str1,str2;
      cin>>str1>>str2;
      vector<int> prefix1(26,0);
      vector<int> suffix1(26,0);
      vector<vector<int>> curr1(a+1);
      vector<vector<int>> curr2(a+1);
      curr1[0]=prefix1;
      curr2[0]=suffix1;
      vector<vector<int>> cuur2(a+1);
      for(int i=0;i<a;i++){
          prefix1[str1[i]-'a']++;
          suffix1[str2[i]-'a']++;
          curr1[i+1]=prefix1;
          curr2[i+1]=suffix1;
      }
      long long ans=0;
      for(int i=0;i<b;i++){
          int c,d;
          cin>>c>>d;
          c--;
          d--;
          vector<int> a1=curr1[c];
          vector<int> a2=curr1[d+1];
          vector<int> a3=curr2[c];
          vector<int> a4=curr2[d+1];
          long long ans=0;
          for(int j=0;j<26;j++){
              ans+=abs((a2[j]-a1[j])-(a4[j]-a3[j]));
          }
          cout<<ans/2<<endl;
      }
      
    }
}