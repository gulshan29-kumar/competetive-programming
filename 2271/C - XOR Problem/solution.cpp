#include <bits/stdc++.h>
using namespace std;
int main(){int t;scanf("%d",&t);while(t--){int n;scanf("%d",&n);int K=1;while(K<=n)K<<=1;
 printf("%d
0",2*K-1);
 for(int i=1;i<K;i++){int g=i^(i>>1),pg=(i-1)^((i-1)>>1);printf(" %d 0",g^pg);}
 puts("");}}