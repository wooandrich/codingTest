#include <bits/stdc++.h>

using namespace std;

priority_queue<int, vector<int>, greater<int>> pq;

int solution(vector<int> scoville, int K) {
    int answer = 0;
    int all_sum = 0;
    
    for (int n : scoville) {
        pq.push(n);
        all_sum += n;
    }
    
    while (pq.top() < K) {
        if (pq.size() == 1) return -1;
        answer++;
        int one = pq.top(); pq.pop();
        int two = pq.top(); pq.pop();
        
        int new_one = one + two * 2;
        pq.push(new_one);
    }
    
    return answer;
}