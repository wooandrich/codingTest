#include <bits/stdc++.h>
using namespace std;


vector<string> v;
int n;

bool compare( string a, string b) {
    if (a.length() != b.length()) {
        return a.length() < b.length();
    }
    return a < b;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;
    
    for (int i=0;i<n;i++) {
        string temp;

        cin >> temp;

        string s_num = "";
        char s_prev = 'a';

        for (auto a : temp) {
            if(isdigit(a)) {
                if (s_num == "0") s_num = a;
                else s_num += a;
            } else {
                if (s_num.size() > 0) {
                    v.push_back(s_num);
                    s_num = "";
                }
            }
        }

        if (s_num.size() > 0) {
            v.push_back(s_num);
        }


         
    }

    sort(v.begin(), v.end(), compare);

    for (auto i : v) cout << i << '\n';
    

    
    







    

    
    

    




    
    
    

    
    return 0;
}