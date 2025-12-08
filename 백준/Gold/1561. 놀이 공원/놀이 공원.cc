#include <bits/stdc++.h>

using namespace std;
typedef long long ll;
ll INF = 1e9;
ll n, m, num, l, r, mid, ret, final_time;
vector<ll> v;

bool check(ll target) {
	ll cnt = 0;

	for (ll i : v) {
		cnt += target / i;
	}

	return cnt >= n - m;
}

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> n >> m;

	for (ll i=0;i<m;i++) {
		cin >> num;
		v.push_back(num);
		r = max(r, num);
	}

	if (n <= m) {
		ret = n;
	} else {
		l = 1;
		r *= n;

		while (l <= r) {
			mid = (l + r) / 2;

			if (check(mid)) {
				final_time = mid;
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}

		ll cnt = m;
		for (ll i : v) {
			cnt += (final_time - 1) / i;
		}

		for (int i = 0; i < m; i++) {
			if (final_time % v[i] == 0) {
				cnt++;
				if (cnt == n) {
					ret = i + 1;
					break;
				}
			}
		}

	}



	cout << ret << '\n';






	


    return 0;
}