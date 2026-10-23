#include <bits/stdc++.h>
using namespace std;
 
int main() {
	int a; cin >> a;
	while(a--) {
		int b,mx=0,cou=0; cin >> b;
		vector<int> c(b);
		for(int i=0;i<b;i++) {
			cin >> c[i];
			if (c[i] > mx) {
				mx = c[i]; cou=1;
			}
			else if (c[i] == mx) cou++;
		}
		sort(c.begin(),c.end());
		if (c[0] == c[b-1]) cout << -1 << endl;
		else {
			cout << b-cou << " " << cou << endl;
			for(int i=0;i<b-cou;i++ ){
				cout << c[i] << " ";
			}
			cout << endl;
			for(int i=b-cou;i<b;i++ ){
				cout << c[i] << " ";
			}
			cout << endl;
		}
	}
}