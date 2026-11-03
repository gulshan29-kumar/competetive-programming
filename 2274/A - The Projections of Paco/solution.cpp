#include<iostream>
using namespace std;
int main(){
int t,p;
cin >> t;
for(;t>0;t--){
int n,a=1,p=0;
cin >> n;
for(int i;n>0;n--){
cin >> i;
p+=a*i;
a*=-1;
}
cout << p << endl;
}
return 0;
}