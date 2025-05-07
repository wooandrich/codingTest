#include<bits/stdc++.h>
using namespace std;

int n;
queue<int> q;

int main() {
	cin >> n;
	
	for (int i=0;i<n;i++){
		string order;
		int x;
		
		cin >> order;
		
		if (order == "push") {
			cin >> x;
			q.push(x);
		}
		else if (order == "pop"){
			if (q.empty()) cout << -1 << endl;
			else {
				cout << q.front() << endl;
				q.pop();
			}
			
		}
		else if (order == "size") {
			cout << q.size() << endl;
		}
		else if (order == "empty") {
			if (q.empty()) cout << 1 << endl;
			else cout << 0 << endl;
		}
		else if ( order == "front"){
			if (q.empty()) cout << -1 << endl;
			else cout << q.front() << endl;
		}
		else {
			if (q.empty()) cout << -1 << endl;
			else cout << q.back() << endl;
		}
	}

	
	
    
    

    return 0;
}