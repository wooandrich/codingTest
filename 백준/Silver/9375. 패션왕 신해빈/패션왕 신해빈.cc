#include<bits/stdc++.h>
using namespace std;


int t,n;
int main() {
	ios::sync_with_stdio(false);
    cin.tie(nullptr);
    
    cin >> t;
    
    for (int i=0;i<t;i++){
    	map<string, int> m;
    	cin >> n;
    	int ans = 1;
    	
    	string a,b;

    	for (int j=0;j<n;j++){
    		cin >> a >> b;
    		m[b]++;
		}
		
		for (auto &it : m){
			ans *= it.second + 1;
		}
		
		cout << ans - 1 << '\n';
    	
    	
	}
	


	
	
    
    

    return 0;
}