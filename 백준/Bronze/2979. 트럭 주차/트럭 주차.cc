#include <bits/stdc++.h>
using namespace std;

int arr[101];
int a,b,c;
int s, e;
int main() {
    cin >> a >> b >> c;

    for (int i=0;i<3;i++){
        cin >> s >> e;

        for (int i=s;i<e;i++){
            arr[i]++;
        }
    }

    int ans = 0;

    for (int i : arr){
        if (i == 1) ans += a;
        if (i == 2) ans += b * 2;
        if (i == 3) ans += c * 3;
    }

    cout << ans;
    

    
    

    




    
    
    

    
    return 0;
}