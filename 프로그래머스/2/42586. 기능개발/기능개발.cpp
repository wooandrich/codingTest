#include <bits/stdc++.h>

using namespace std;

queue<int> q;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
    vector<int> answer;

    for (int i=0;i<progresses.size();i++) {
        int day = 0;
        int r = 100 - progresses[i];

        day += r / speeds[i];
        if (r % speeds[i]) day++;
        q.push(day);
    }

    int start = q.front();
    int temp = 0;

    while (q.size()) {
        if (q.front() <= start) {
            temp++;
            q.pop();
        } else {
            start = q.front();
            answer.push_back(temp);
            temp = 0;
        }
    }

    if (temp) answer.push_back(temp);





    return answer;
}