#include<bits/stdc++.h>
using namespace std;

string s;
int n;
string pre,fix;
bool ok;
int main() {
	cin >> n;
	
	cin >> s;
	
	int star = s.find('*');
	pre = s.substr(0, star);
	fix = s.substr(star + 1);
	
	for (int i=0;i<n;i++){
		string file;
		cin >> file;
		
		
		
		if (file.size() >= pre.size() + fix.size()) {
			bool preMatch = file.substr(0, pre.size()) == pre;
			bool fixMatch = file.substr(file.size() - fix.size(), fix.size()) == fix;
			
			ok = preMatch && fixMatch;
		} else {
			ok = false;
		}
		cout << (ok ? "DA" : "NE") << endl;
	}
	
	
	
	
	
	
	
    
    

    return 0;
}