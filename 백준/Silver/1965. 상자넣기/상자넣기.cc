#include <bits/stdc++.h>

using namespace std;

int dp[1004], arr[1004];
int n, ret;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> n;

	fill(dp, dp + n, 1);

	for (int i=0;i<n;i++) {
		cin >> arr[i];
	}

	for (int i=0;i<n;i++){
		for (int j=0;j<i;j++){
			if (arr[i] > arr[j]) {
				dp[i] = max(dp[i], dp[j] + 1);
			}
		}
		ret = max(ret, dp[i]);
	}

	cout << ret << '\n';




	
	


    return 0;
}