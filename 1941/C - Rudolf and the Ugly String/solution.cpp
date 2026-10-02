#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	   int a;
	   cin>>a;
	   string str;
	   cin>>str;
	   string s1="mapie";
	   string s2="map";
	   string s3="pie";
	   int count1=0;
	   int pos1=0;
	   int count2=0;
	   int pos2=0;
	   int count3=0;
	   int pos3=0;
	   while((pos1=str.find(s1,pos1))!=string::npos){
	       pos1++;
	       count1++;
	   }
	    while((pos2=str.find(s2,pos2))!=string::npos){
	       pos2++;
	       count2++;
	   }
	    while((pos3=str.find(s3,pos3))!=string::npos){
	       pos3++;
	       count3++;
	   }
	   cout<<count2+count3-count1<<endl;
	   
	}
 
}