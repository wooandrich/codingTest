#include <bits/stdc++.h>
using namespace std;


int a[26];
string s;
int main() {
    cin >> s;

    for (int i : s) {
        a[i - 97]++;
    }

    for (int i =0; i < 26;i++) {
        cout << a[i] << " ";
    }
    cout << endl;

    
    

    




    
    
    

    
    return 0;
}