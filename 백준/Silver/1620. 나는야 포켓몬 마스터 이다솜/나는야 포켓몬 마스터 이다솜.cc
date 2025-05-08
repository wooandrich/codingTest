#include<bits/stdc++.h>
using namespace std;

map<int,string> mp1;
map<string, int> mp2;
int n,m;
int main() {
	ios::sync_with_stdio(false);
    cin.tie(nullptr);
	cin >> n >> m;
	
	for (int i=1;i<=n;i++){
		string name;
		cin >> name;
		mp1.insert({i, name});
		mp2.insert({name, i});
	}
	
	for (int i=0;i<m;i++){
		string k;
		cin >> k;
		
		if (isdigit(k[0])) {
			cout << mp1[stoi(k)] << '\n';
		} else {
			cout << mp2[k] << '\n';
		}
	}


	
	
    
    

    return 0;
}