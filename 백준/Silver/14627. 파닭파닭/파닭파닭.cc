#include <bits/stdc++.h>

using namespace std;
typedef long long ll;
ll INF = 1e9;
ll s, c, num, l, r, mid, ret, total_sum;
vector<ll> v;

bool check(ll target) {
	ll cnt = 0;

	for (ll i : v) {
		cnt += i / target;
	}
	return cnt >= c;
}



int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> s >> c;

	for (int i=0;i<s;i++) {
		cin >> num;
		total_sum += num;
		v.push_back(num);
	}

	l = 1;
	r = INF;
	
	while (l <= r) {
		mid = (l + r) / 2;

		if (check(mid)) {
			ret = max(ret, mid);
			l = mid + 1;
		} else {
			r = mid - 1;
		}
	}

	cout << total_sum - c * ret << '\n';





	


    return 0;
}