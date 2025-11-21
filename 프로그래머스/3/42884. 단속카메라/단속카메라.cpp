#include <bits/stdc++.h>

using namespace std;

priority_queue<pair<int,int>, vector<pair<int,int>>, greater<pair<int,int>>> pq;

int s, e;

int solution(vector<vector<int>> routes) {
    int answer = 0;
    
    for (vector<int> route : routes) {
        pq.push({route[1], route[0]});
    } 
    
    while(pq.size()) {
        tie(e,s) = pq.top(); pq.pop();
        
        // cout << e << " " << s << endl;
         
        while (pq.size() && e >= pq.top().second) {
            pq.pop();
        }
        answer++;
    }
    
    return answer;
}