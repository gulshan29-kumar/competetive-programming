#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
      int a,b;
      cin>>a>>b;
      char arr[a][a];
      for(int i=0;i<a;i++){
          string st;
          cin>>st;
          for(int j=0;j<a;j++){
              arr[i][j]=st[j];
          }
      }
      for(int i=0;i<a/b;i++){
          for(int j=0;j<a/b;j++){
              cout<<arr[i*b][j*b];
          }
          cout<<endl;
      }
      
    }
}