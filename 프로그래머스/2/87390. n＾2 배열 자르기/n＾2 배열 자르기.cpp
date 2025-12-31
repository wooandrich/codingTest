#include <bits/stdc++.h>

using namespace std;

vector<int> solution(int n, long long left, long long right) {
    vector<int> answer;

    for (long long i = left; i <= right; i++) {
        int ans = max(i / n, i % n);
        answer.push_back(ans+ 1);
    }

    return answer;
}