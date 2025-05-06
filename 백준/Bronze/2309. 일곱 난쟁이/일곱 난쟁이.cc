#include <bits/stdc++.h>
using namespace std;


int n = 9, temp;
vector<int> v;
int main() {

    int cnt = 0;

    int one,two;

    
    for (int i=0;i<n;i++){
        cin >> temp;
        cnt += temp;
        v.push_back(temp);
    }

    for (int i=0;i<n;i++){
        for (int j = i+1;j<n;j++){
            if (cnt - v[i] - v[j] == 100){
                one = v[i];
                two = v[j];
                goto done;
            }
        }
    }
done:
    sort(v.begin(), v.end());

    for(int i:v) {
        if (i == one || i == two) continue;

        cout << i << endl;
    }




    
    
    

    
    return 0;
}