#include<bits/stdc++.h>
using namespace std;

int n,k;

int main() {
	cin >> n >> k;
	
	vector<int> arr(n+1,0);
	vector<int> prefix(n+1,0);
	
	for(int i=1;i<=n;i++){
		cin >> arr[i];
	}
	
	for(int i=1;i<=n;i++){
		prefix[i] = prefix[i-1] + arr[i];
	}
	
	vector<int> result;
	for(int i=0;i<=n-k;i++){
		result.push_back(prefix[i + k] - prefix[i]);
	}
	
	
	
	int ans = *max_element(result.begin(), result.end());
	cout << ans << endl;
	

	
	
	
	
	
	
	
	
	
    
    

    return 0;
}