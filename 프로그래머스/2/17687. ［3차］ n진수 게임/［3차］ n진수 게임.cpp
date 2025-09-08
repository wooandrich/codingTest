#include <bits/stdc++.h>

using namespace std;

vector<char> v, start;

string solution(int n, int t, int m, int p) {
    string answer = "";

    for (int i=0;i<t*m;i++) {
        int target = i;
        if (target == 0) v.push_back('0');
        else {
            vector<char> temp;
            while (target > 0) {
                int check = target % n;
                if (check >= 10) {
                    temp.push_back('A' + (check - 10));
                }
                else temp.push_back((target % n) + '0');
                target /= n;
            }
            reverse(temp.begin(), temp.end());
            v.insert(v.end(), temp.begin(), temp.end());
        }
    }

    for (int i=0;i<t;i++) {
       answer += v[(p - 1) + (m * i)];
    }



    return answer;
}