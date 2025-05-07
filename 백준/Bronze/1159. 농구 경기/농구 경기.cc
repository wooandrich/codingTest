#include<bits/stdc++.h>
using namespace std;

int n;
string result;
string name;
map<char, int> m;
int main() {
	
	
	cin >> n;
	
	for (int i=0;i<n;i++){
		cin >> name;
		
		char fname = name[0];
		
		m[fname]++;
	}
	
	bool sign = false;
	for (auto& it : m) {
		if (it.second >= 5) {
			sign = true;
			result += it.first;
		}
	}
	if (sign) {
		sort(result.begin(), result.end());
		cout << result << endl;
	}else {
		cout << "PREDAJA" << endl;
	}
    
    

    return 0;
}