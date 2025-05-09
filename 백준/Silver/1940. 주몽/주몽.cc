#include<bits/stdc++.h>
using namespace std;

/**
	주몽
	
	 1. 완전탐색으로 풀어보기
	 2. 이진탐색으로 풀어보기 
*/
int n,m;
vector<int> v; 
int ans;
int main() {
	ios::sync_with_stdio(false);
    cin.tie(nullptr);

	cin >> n >> m;
	
	for (int i=0;i<n;i++){
		int temp;
		cin >> temp;
		v.push_back(temp);
	}
	
	sort(v.begin(), v.end());
	
	int s = 0;
	int e = n-1;
	
	while (s < e) {
		int mid = v[s] + v[e];
		
		if (mid == m) {
			ans++;
			s++;
		}
		else if (mid < m) {
			s++;
		}
		else {
			e--;
		}
	}
	
	cout << ans << '\n';
	
	

    
	


	
	
    
    

    return 0;
}