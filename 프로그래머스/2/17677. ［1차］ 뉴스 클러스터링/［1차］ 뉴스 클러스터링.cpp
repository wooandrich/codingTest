#include <bits/stdc++.h>

using namespace std;

double a,b;
set<string> s;
vector<string> v1, v2;
string new_str1, new_str2;

int solution(string str1, string str2) {
    int answer = 0;
    if (str1.empty() && str2.empty()) return 1;

    for (int i=0;i<str1.size()-1;i++) {
        string temp1 = str1.substr(i, 2);

        int ok = 1;
        for (int j=0;j<temp1.size();j++) {
            if (!isalpha(temp1[j])) {
                ok = 0;
                break;
            }
            temp1[j] = tolower(temp1[j]);

        }
        if (ok) {
            v1.push_back(temp1);
            s.insert(temp1);
        }
    }

    for (int i=0;i<str2.size()-1;i++) {
        string temp2 = str2.substr(i, 2);

        int ok = 1;
        for (int j=0;j<temp2.size();j++) {
            if (!isalpha(temp2[j])) {
                ok = 0;
                break;
            }
            temp2[j] = tolower(temp2[j]);

        }
        if (ok) {
            v2.push_back(temp2);
            s.insert(temp2);
        }
    }


    for (string target : s) {
        int cnt1 = 0;
        int cnt2 = 0;

        for (string s1 : v1) {
            if (target == s1) cnt1++;
        }

        for (string s2 : v2) {
            if (target == s2) cnt2++;
        }

        a += min(cnt1, cnt2);
        b += max(cnt1, cnt2);
    }


    if (b == 0) return 65536;
    answer = a / b * 65536;

    return answer;
}