#include <bits/stdc++.h>

using namespace std;

int arr[34];

int solution(int n, vector<int> lost, vector<int> reserve) {
    int answer = 0;

    fill(arr, arr+34, 1);

    for (int i : reserve) arr[i]++;
    for (int i : lost) arr[i]--;

    for (int i=1;i<=n;i++) {
        if (arr[i] > 1) {
            if (arr[i - 1] == 0) {
                arr[i]--;
                arr[i - 1]++;
            } else if (arr[i + 1] == 0) {
                arr[i]--;
                arr[i+1]++;
            }
        }
    }

    for (int i=1;i<=n;i++) {
        if (arr[i]) answer++;
    }

    return answer;
}