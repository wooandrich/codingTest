#include<bits/stdc++.h>
using namespace std;

int t;
int ret;

int main() {
	ios::sync_with_stdio(false);
    cin.tie(nullptr);
    
    cin >> t;
    
    while (t--) {
    	int n;
    	cin >> n;
    	
    	int cnt = 0;
    	
    	int start = 5;
    	
    	while (n >= start) {
    		cnt += ( n / start );
    		start *= 5;
		}
		
		cout << cnt << '\n';
	}




    return 0;
}