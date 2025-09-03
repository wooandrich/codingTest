#include <bits/stdc++.h>

using namespace std;

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;

    for (int i=0;i<n;i++) {
        int cnt = arr1[i] | arr2[i];

        string s = "";

        for (int j=0;j<n;j++) {
            if (cnt & (1 << j)) s += "#";
            else s += " ";
        }
        reverse(s.begin(), s.end());
        answer.push_back(s);
    }

    return answer;
}