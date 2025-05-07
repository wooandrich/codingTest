#include<bits/stdc++.h>
using namespace std;


int n;
string s;
vector<int> v;
int ans;
int main() {
	cin >> n;
	cin >> s;
	
	for (int i : s) {
		v.push_back(i - 96);
	}
	
	
	
	
	for (int i=0;i<v.size();i++){
		ans += int(v[i] * pow(31, i))% 1234567891;
	}
	
	cout << ans << endl;
	
	
	
	
	
	
	
	
	
    
    

    return 0;
}