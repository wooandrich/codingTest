#include <bits/stdc++.h>

using namespace std;

int arr[300004], ret = 1e9, n, m, l,r,mid;

bool search(int target) {
	int result = 0;

	for (int i=0;i<m;i++){
		result += (arr[i] / target);
		if (arr[i] % target) result++;
	}

	return result <= n;
}

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> n >> m;

	for (int i=0;i<m;i++){
		cin >> arr[i];
		r = max(r, arr[i]);
	}

	l = 1;

	while(l <= r) {
		mid = (l + r) / 2;

		if (search(mid)) {
			ret = min(ret, mid);
			r = mid - 1;
		} else {
			l = mid + 1;
		}
	}

	cout << ret << '\n';








	


    return 0;
}