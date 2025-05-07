#include<bits/stdc++.h>
using namespace std;


int main() {
	string a,b,c;
	int next;
	cin >> a >> b >> c;
	
	if (a != "Fizz" && a != "Buzz" && a != "FizzBuzz") {
		next = stoi(a) + 3;
	}
	else if (b != "Fizz" && b != "Buzz" && b != "FizzBuzz") {
		next = stoi(b) + 2;
	}
	else if (c != "Fizz" && c != "Buzz" && c != "FizzBuzz") {
		next = stoi(c) + 1;
	}
	
	if (next % 3 == 0 && next % 5 == 0) cout << "FizzBuzz" << endl;
	else if (next % 3 == 0) cout << "Fizz" << endl;
	else if (next % 5 == 0) cout << "Buzz" << endl;
	else cout << next << endl; 
	
	
	
	
    
    

    return 0;
}