#include<bits/stdc++.h>
using namespace std;

int h,w;


int main() {
	ios::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int time[101][101];
	string cloud[101];

	cin >> h >> w;
	
	for (int i=0;i<h;i++) {
		cin >> cloud[i];
		int cnt = -1;
		for (int j=0;j<w;j++) {
			if (cloud[i][j] == 'c') {
				cnt = 0;
			}
			else if (cnt != -1) cnt++;
			time[i][j] = cnt;
		}
		
	}
	
	for (int i=0;i<h;i++) {
		for (int j=0;j<w;j++) {
			cout << time[i][j] << " ";
		}
		cout << '\n';
	}
	

	
	

    
	


	
	
    
    

    return 0;
}