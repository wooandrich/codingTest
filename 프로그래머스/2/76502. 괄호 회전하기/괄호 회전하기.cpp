#include <bits/stdc++.h>

using namespace std;
vector<char> v;

bool check(vector<char> & a) {
    stack<char> stack;

    for (char c : a) {
        if (c == '(' || c == '[' || c == '{') {
            stack.push(c);
        } else {
            if (stack.empty()) return false;

            if (c == ')' && stack.top() == '(') stack.pop();
            else if (c == ']' && stack.top() == '[') stack.pop();
            else if (c == '}' && stack.top() == '{') stack.pop();
            else return false;
        }
    }

    return stack.empty();
}

int solution(string s) {
    int answer = 0;

    for (char c : s) {
        v.push_back(c);
    }

    for (int i=0;i<s.size();i++) {
        // 왼쪽으로 i 만큼 회전
        rotate(v.begin(), v.begin() + 1, v.end());
        if (check(v)) answer++; // 괄호 만족하는지 체크
    }

    return answer;
}