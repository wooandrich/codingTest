#include <bits/stdc++.h>
using namespace std;

long long a,b,c;
long long pow(long long A, long long exp){
    if (exp == 1) {
        return A % c;
    }
    long long temp = pow(A, exp / 2);

    if (exp % 2 == 1) {
        return (temp * temp % c) * A % c;
    }
    return temp * temp % c;
}
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> a >> b >> c;

    
    


    cout << pow(a,b) << '\n';


    
    

    




    
    
    

    
    return 0;
}