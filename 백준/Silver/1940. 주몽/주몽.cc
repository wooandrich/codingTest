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
	
	for (int i=0;i<n;i++){
		for (int j=i+1;j<n;j++){
			if(v[i] + v[j] == m) ans++;
		}
	}
	
	cout << ans << '\n';
	
	

    
	


	
	
    
    

    return 0;
}