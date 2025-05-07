#include<bits/stdc++.h>
using namespace std;

string s;

int main() {
	getline(cin, s);
	
	string result;
	
	for (char c: s) {
		if(islower(c)) {
			char x = (char) ((c - 'a' + 13) % 26 + 'a');
			result += x;
		}
		else if (isupper(c)){
			char x = (char) ((c - 'A' + 13) % 26 + 'A');
			result += x;
		}
		else {
			result += c;
		}
	}
	
	cout << result << endl;
	
	
	
    
    

    return 0;
}