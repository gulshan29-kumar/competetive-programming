#include<cstdio>
int n,q,a[200005],ans,p,x;
void Main(){
    scanf("%d%d",&n,&q),ans=0;
    for(int i=1;i<=n;i++)scanf("%d",&a[i]),ans+=(a[i]%3==0)||(a[i]%5==0);
    printf("%d ",ans);
    for(int i=1;i<=q;i++)scanf("%d%d",&p,&x),ans-=(a[p]%3==0)||(a[p]%5==0),a[p]=x,ans+=(x%3==0)||(x%5==0),printf("%d ",ans);
}
int main(){
    int t;
    scanf("%d",&t);
    while(t--)Main(),puts("");
}