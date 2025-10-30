#include <bits/stdc++.h>

using namespace std;

int ret;

void dfs(vector<int> numbers, int target, int idx, int now_val) {
    if (idx == numbers.size()) {
        if (target == now_val) {
            ret++;
        }
        return;
    }

    

    dfs(numbers, target, idx + 1, now_val + numbers[idx]);
    dfs(numbers, target, idx + 1, now_val - numbers[idx]);
}

int solution(vector<int> numbers, int target) {

    dfs(numbers, target, 0, 0);

    return ret;
}