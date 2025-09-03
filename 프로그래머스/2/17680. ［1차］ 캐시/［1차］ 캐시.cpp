#include <bits/stdc++.h>

using namespace std;

deque<string> dq;

int solution(int cacheSize, vector<string> cities) {
    int answer = 0;

    for (string city : cities) {
        if (cacheSize == 0) {
            answer += 5;
            continue;
        }
        
        for (int i=0;i<city.size();i++) {
            city[i] = tolower(city[i]);
        }
        int ok = 0;
        for (int i=0;i<dq.size();i++) {
            if (dq[i] == city) {
                // 캐시히트
                ok = 1;
                dq.erase(dq.begin() + i);
                dq.push_front(city);
                answer += 1;
                break;
            }
        }
        if (!ok) {
            if (dq.size() < cacheSize) {
                dq.push_front(city);
                answer += 5;
            } else {
                dq.pop_back();
                dq.push_front(city);
                answer += 5;
            }
        }
    }

    return answer;
}