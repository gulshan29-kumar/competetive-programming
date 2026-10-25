/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    int w;
    cin>>w;
    if(w>2 && w%2==0)
    {
        cout<<"YES"<<endl;
    }
    else
        cout<<"NO"<<endl;
}
*/
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
///int b[200000]
 
int main()
{
    int t, n;
    char b[200000], a[200000];
//    ifstream cin("a.txt");
    cin>>t;
    for(int j=0; j<t; j++)
    {
        cin>>n;
        for(int i=0; i<n; i++)
        {
            cin>>b[i];
        }
        a[0]='1';
        for(int i=1; i<n; i++)
        {
            a[i]='1';
            if(a[i-1]+b[i-1]!=a[i]+b[i])
            {
                a[i]='1';
            }
            else
            {
                a[i]='0';
            }
        }
        for(int i=0; i<n; i++)
        {
            cout<<a[i];
        }
 
        cout<<endl;
    }
}
*/
 
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
///int b[200000]
 
int main()
{
    int n, p, p_p[10000], ppp[10000], q, q_q[10000], qqq[10000];
    cin>>n>>p;
    for(int i=0; i<10000; i++)
    {
        ppp[i]=0;
        qqq[i]=0;
    }
    for(int i=0; i<p; i++)
    {
        cin>>p_p[i];
        ppp[p_p[i]]++;
    }
    cin>>q;
    for(int i=0; i<q; i++)
    {
        cin>>q_q[i];
        qqq[q_q[i]]++;
    }
    for(int i=1; i<=n; i++)
    {
 
        if(ppp[i]!=0 || qqq[i]!=0)
        {
 
        }
        else
        {
            cout<<"Oh, my keyboard!"<<endl;
            return 0;
        }
    }
    cout<<"I become the guy."<<endl;
}
*/
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
 
int main()
{
    int n;
    cin>>n;
    for(int i=1; i<=n; i++)
    {
        if(i%2!=0)
        {
            cout<<"I hate ";
        }
        else
        {
            cout<<"I love ";
        }
        if(i!=n)
        {
            cout<<"that ";
        }
    }
    cout<<"it"<<endl;
}
*/
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
 
int main()
{
    int n;
    int a[10000];
    string zodis;
    cin>>n;
    cin>>zodis;
    for(int i=0; i<10000; i++)
    {
        a[i]=0;
    }
    for(int i=0; i<n; i++)
    {
        a[zodis[i]]++;
    }
    for(int i='a'; i<='z'; i++)
    {
        if(a[i]!=0 || a[i-'a'+'A']!=0)
        {
 
        }
        else
        {
            cout<<"NO"<<endl;
            return 0;
        }
 
    }
    cout<<"YES"<<endl;
}
*/
 
 
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
 
int main()
{
    int n, pi[10000], qi[10000];
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>pi[i]>>qi[i];
    }
    int tinka=0;
    for(int i=0; i<n; i++)
    {
        if(qi[i]-pi[i]>=2)
        {
            tinka++;
        }
    }
    cout<<tinka<<endl;
}
*/
 
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
 
int main()
{
    string a, b;
    cin>>a>>b;
    a.length();
    string c(a);
    for(int i=0; i<a.length(); i++)
    {
        if(a[i]!=b[i])
        {
            c[i]=1;
        }
        else
        {
            c[i]=0;
        }
    }
    for(int i=0; i<a.length(); i++)
    {
        cout<<int(c[i]);
    }
}
*/
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
 
int main()
{
    int n;
    string a;
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>a;
        a.length();
        if(a.length()>10)
        {
            cout<<a[0];
            cout<<a.length()-2;
            cout<<a[a.length()-1];
            cout<<endl;
        }
        else
        {
            cout<<a;
            cout<<endl;
        }
    }
}
*/
 
 
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
 
int main()
{
    int n, a[10000];
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>a[i];
    }
    for(int j=0; j<n; j++)
    {
        for(int i=0; i<n-1; i++)
        {
            if(a[i]>a[i+1])
            {
                swap(a[i], a[i+1]);
            }
        }
    }
    for(int i=0; i<n; i++)
    {
        cout<<a[i]<<" ";
    }
}
*/
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
 
int main()
{
    int n, a[10000];
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>a[i];
    }
    for(int j=0; j<n; j++)
    {
        for(int i=0; i<n-1; i++)
        {
            if(a[i]>a[i+1])
            {
                int b, c;
                b=a[i];
                c=a[i+1];
                a[i]=c;
                a[i+1]=b;
            }
        }
    }
    for(int i=0; i<n; i++)
    {
        cout<<a[i]<<" ";
    }
}
*/
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
void Suma(int x)
{
    int suma=0;
    for(int i=1; i<=x; i++)
    {
        suma+=i;
    }
    cout<<suma<<endl;
}
 
int main()
{
    int a, b, c, d;
    cin>>a>>b>>c>>d;
    Suma(a);
    Suma(b);
    Suma(c);
    Suma(d);
}
*/
///void nieko negrazina
///siuo atveju funkcija issikviecia skaiciu
 
 
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    int n, h, a[10000];
    cin>>n>>h;
    for(int i=0; i<n; i++)
    {
        cin>>a[i];
    }
    int sk=0;
    for(int i=0; i<n; i++)
    {
        if(a[i]<=h)
        {
            sk++;
        }
        else
        {
            sk+=2;
        }
    }
    cout<<sk<<endl;
}
*/
 
 
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    int n, a[100000];
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>a[i];
    }
    for(int i=0; i<n; i++)
    {
        if(a[i]!=0)
        {
            cout<<"HARD"<<endl;
            return 0;
        }
    }
    cout<<"EASY"<<endl;
}
*/
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    cin.tie(0);
    ios_base::sync_with_stdio(false);
    int n, a[100000];
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>a[i];
    }
    int gr=1;
    for(int i=1; i<n; i++)
    {
        if(a[i]==a[i-1])
        {
 
        }
        else
        {
            gr++;
        }
    }
    cout<<gr<<endl;
}
*/
 
 
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
     int n, a[10000];
     cin>>n;
     for(int i=1; i<=n; i++)
     {
         cin>>a[i];
     }
     int maxi, mx, mini, mn;
     maxi=0;
     mini=101;
     for(int i=1; i<=n; i++)
     {
         if(a[i]>maxi)
         {
             maxi=a[i];
             mx=i;
         }
         if(a[i]<=mini)
         {
             mini=a[i];
             mn=i;
         }
     }
     int atsmin;
     atsmin=n-mn;
     if(mx>mn)
     {
         cout<<mx-1+atsmin-1<<endl;
     }
     else
     {
         cout<<(mx-1)+atsmin<<endl;
     }
}
*/
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    int s[10000];
    for(int i=0; i<4; i++)
    {
        cin>>s[i];
    }
    int plius=0;
    for(int j=0; j<4; j++)
    {
        for(int i=0; i<3; i++)
        {
            if(s[i]>s[i+1])
            {
                swap(s[i], s[i+1]);
            }
        }
    }
    for(int i=0; i<3; i++)
    {
        if(s[i]==s[i+1])
        {
            plius++;
        }
    }
    cout<<plius<<endl;
}
*/
 
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    int k, l, m, n, d;
    cin>>k>>l>>m>>n>>d;
    int dead=0;
    for(int i=1; i<=d; i++)
    {
        if(i%k!=0 && i%l!=0 && i%m!=0 && i%n!=0)
        {
            dead++;
        }
    }
    cout<<d-dead<<endl;
}
*/
 
 
 
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    int n, p[10000], v[10000], t[10000];
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>p[i]>>v[i]>>t[i];
    }
    int tinka=0;
    for(int i=0; i<n; i++)
    {
        if(p[i]+v[i]+t[i]>=2)
        {
            tinka++;
        }
    }
    cout<<tinka<<endl;
}
*/
 
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    int y, a, b, c, d;
    cin>>y;
    a=y/100;
    b=y%100;
    cout<<a<<" "<<b<<" "<<c<<" "<<d<<endl;
//    for(int i=y; i<10000; i++)
//    {
//        if(y[0]==y[1] || y[0]==y[2] || y[0]==y[3] || y[1]==y[2] || y[1]==y[3] || y[2]==y[1] || y[2]==y[3])
//        {
//            y=inty+1;
//        }
//        else
//        {
//            cout<<y<<endl;
//            return 0;
//        }
//    }
//    cout<<y<<endl;
}
*/
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    string s, t;
    int ilgis;
    cin>>s>>t;
    ilgis=s.length()-1;
    for(int i=0; i<s.length(); i++)
    {
        if(s[i]!=t[ilgis])
        {
            cout<<"NO"<<endl;
            return 0;
        }
        ilgis--;
    }
    cout<<"YES"<<endl;
}
*/
 
 
 
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    int n, a[10000];
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>a[i];
    }
    int b[10000], j=0;
    for(int i=0; i<n-1; i++)
    {
        if(a[i]!=a[i+1])
        {
            b[j]=a[i];
            j++;
        }
    }
    b[j]=a[n-1];
    j++;
    for(int i=0; i<j; i++)
    {
        cout<<b[i]<<" ";
    }
}
*/
 
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    int n, a[10000], m=11;
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>a[i];
    }
    int b[10000], j=0, ai=0;
    for(int i=0; i<n-1; i++)
    {
        b[j]=a[i];
        j++;
        if(a[i]!=a[i+1] && a[i]==m)
        {
            b[j]=a[i];
            j++;
            ai++;
        }
    }
    b[j]=a[n-1];
    j++;
    if(ai==0)
    {
        b[j]=m;
        j++;
    }
    for(int i=0; i<j; i++)
    {
        cout<<b[i]<<" ";
    }
}
*/
 
 
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    string a[10000];
    int n, x=0;
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>a[i];
    }
    int plius=0, minuss=0;
    for(int i=0; i<n; i++)
    {
        if(a[i]=="++X" || a[i]=="+X+" || a[i]=="X++")
        {
            x++;
        }
        else
        {
            x--;
        }
    }
    cout<<x<<endl;
}
*/
 
 
 
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    string a;
    int sk;
    cin>>a;
    sk=a.length();
    long long kiekis=0;
    for(int i=0; i<sk; i++)
    {
        if(a[i]=='4' || a[i]=='7')
        {
            kiekis++;
        }
    }
    if(kiekis==4 || kiekis==7)
    {
        cout<<"YES"<<endl;
    }
    else
    {
        cout<<"NO"<<endl;
    }
}
*/
 
 
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    int m, n, ats;
    cin>>m>>n;
    ats=m*n/2;
    cout<<ats<<endl;
}
*/
 
 
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    string zodis;
    cin>>zodis;
    if('a'<=zodis[0] && zodis[0]<='z')
    {
        zodis[0]=zodis[0]-'a'+'A';///????????????
    }
    cout<<zodis;
}
*/
 
 
/*
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    string zodis;
    cin>>zodis;
    int ilgis=zodis.length(), didele=0, maza=0;
    for(int i=0; i<ilgis; i++)
    {
        if(zodis[i]>='A' && zodis[i]<='Z')
        {
            didele++;
        }
        if(zodis[i]>='a' && zodis[i]<='z')
        {
            maza++;
        }
    }
    if(didele>maza)
    {
        for(int i=0; i<ilgis; i++)
        {
            if(zodis[i]>='a' && zodis[i]<='z')
            {
                zodis[i]=zodis[i]-'a'+'A';
            }
        }
        cout<<zodis<<endl;
        return 0;
    }
    if(maza>didele)
    {
        for(int i=0; i<ilgis; i++)
        {
            if(zodis[i]>='A' && zodis[i]<='Z')
            {
                zodis[i]=zodis[i]-'A'+'a';
            }
        }
        cout<<zodis<<endl;
        return 0;
    }
    if(maza==didele)
    {
        for(int i=0; i<ilgis; i++)
        {
            if(zodis[i]>='A' && zodis[i]<='Z')
            {
                zodis[i]=zodis[i]-'A'+'a';
            }
        }
        cout<<zodis<<endl;
        return 0;
    }
}
*/
 
 
 
 
 
 
#include <locale>
#include <iostream>
#include <cmath>
#include <cstdlib>
#include <iomanip>
#include <fstream>
#include <string>
 
using namespace std;
 
int main()
{
    int a, b;
    cin>>a>>b;
    int metai=0;
    while(a<=b)
    {
        metai++;
        a=a*3;
        b=b*2;
        ///cout<<"a "<<a<<" b "<<b<<endl;
    }
    cout<<metai<<endl;
}