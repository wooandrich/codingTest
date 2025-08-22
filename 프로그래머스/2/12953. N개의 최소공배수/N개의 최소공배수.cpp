#include <bits/stdc++.h>

using namespace std;

int solution(vector<int> arr) {
    int answer = 0;
    
    sort(arr.rbegin(), arr.rend());
    
    int num = arr[0];
    
    int i=1;
    while (1) {
        int ok = 1;
        for (auto & n : arr) {
            answer = num * i;
            if (answer % n != 0) {
                ok = 0;
                break;
            }
        }
        
        if (ok) break;
        i++;
    }
    
    return answer;
}