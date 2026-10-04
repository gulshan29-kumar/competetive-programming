#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	int a;
	cin>>a;
    string str1;
    string str2;
    cin>>str1>>str2;
    int cnt0e=0;
    int cnt0o=0;
    for(int i=0;i<a;i++){
        if(str1[i]=='0'){
            if(i%2==0) cnt0e++;
            else cnt0o++;
        }
    }
    int cntze=0;
    int cntzo=0;
    for(int i=0;i<a;i++){
        if(str2[i]=='0'){
            if(i%2==0) cntze++;
            else cntzo++;
        }
    }
    int reqo=a-a/2;
    int reqe=a/2;
    if(cnt0e+cntzo>=reqo&&cnt0o+cntze>=reqe){
        cout<<"Yes"<<endl;
    }
    else cout<<"No"<<endl;
	}
 
}