#include<bits/stdc++.h>
using namespace std;

int n;
int ans;
int main() {
	
	cin >> n;
	
	while (n > 1) {
		ans += n / 5;
		n /= 5;
		
	}
	
	cout << ans;
	
	
    
    

    return 0;
}