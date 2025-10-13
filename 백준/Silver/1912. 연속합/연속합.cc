#include <bits/stdc++.h>

using namespace std;

int n, sum, a, ret = -1001;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
    
	cin >> n;

	for (int i=0;i<n;i++){
		cin >> a;

		sum += a;

		ret = max(ret, sum);
		if (sum < 0) sum = 0;
	}

	cout << ret << '\n';
	


    return 0;
}