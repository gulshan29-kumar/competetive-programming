#include <bits/stdc++.h>
using namespace std;
int main(){int t;scanf("%d",&t);while(t--){int n,k;scanf("%d %d",&n,&k);vector<int>c(n+2,0);
 for(int i=0;i<n;i++){int a;scanf("%d",&a);c[a]++;}
 int q=0;while(c[q]>2*k-1)q++;
 puts(c[q]==2*k-1?"YES":"NO");}}