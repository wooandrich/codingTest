#include<bits/stdc++.h>
using namespace std;


int n;
string s;
vector<int> v;
long long ans = 0;
const long long MOD = 1234567891;



int main() {
	cin >> n;
	cin >> s;
	
	for (int i : s) {
		v.push_back(i - 96);
	}
	
	vector<long long> power(n);
	power[0] = 1;
	for (int i = 1; i < n; ++i) {
	    power[i] = (power[i-1] * 31) % MOD;
	}
	
	
	
	
	for (int i=0;i<v.size();i++){
		ans = (ans + v[i] * power[i] % MOD) % MOD;
	}
	
	cout << ans << endl;
	
	
	
	
	
	
	
	
	
    
    

    return 0;
}