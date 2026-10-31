#include <iostream>
 
using namespace std;
 
void sol() {
	int n;
	cin >> n;
	int c=0, j, ans=0, k, i;
	while (ans<n) {
		c++;
		ans=0;
		for (j=1; j<=c; j++) {
			ans += (c/j)*j;
		}
	}
	cout << c << "
";
	int mesh=1;
	for (i=c; i>0; i--) {
		for (j=0; j<c/i; j++) {
			if (i>n) break;
			for (k=0; k<i; k++) cout << mesh << " ";
			mesh++;
			n -= i;
		}
		if (not n) break;
	}
	cout << "
";
}
 
int main(int argc, char **argv)
{
	int q;
	cin >> q;
	for (int qq=0; qq<q; qq++) {
		sol();
	}
	return 0;
}
 