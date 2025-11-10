#include <bits/stdc++.h>

using namespace std;
typedef long long ll;
ll INF = 1e18;
ll n, atk, t, a, h, max_hp = INF, cur_hp, l, r, mid;

struct INFO {
	ll t;
	ll a;
	ll h;
};

vector<INFO> v;

bool check(ll now_hp, ll cur_atk) {
	ll result = now_hp;
	for (INFO i : v) {
		if (i.t == 1) {
			ll cnt = i.h / cur_atk;
			if (i.h % cur_atk == 0) cnt--;
			result -= i.a * cnt;
			if (result <= 0) return false;
		} else if (i.t == 2) {
			cur_atk += i.a;
			result = min(result + i.h, now_hp);
		}
	}

	return result > 0;
}


int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> n >> atk;

	for (int i=0;i<n;i++) {
		cin >> t >> a >> h;

		v.push_back({t, a, h});
	}

	l = 1;
	r = INF;

	while (l <= r) {
		mid = (l + r) / 2;

		if (check(mid, atk)) {
			max_hp = min(max_hp, mid);
			r = mid - 1;
		} else {
			l = mid + 1;
		}
	}

	cout << max_hp << '\n';








	


    return 0;
}