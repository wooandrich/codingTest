#include <bits/stdc++.h>

using namespace std;


stack<char> st;

string solution(string number, int k) {
    string answer = "";
    
    for (char s : number) {
        if (st.empty()) {
            st.push(s);
        } else {
            while (st.size() && k > 0 && st.top() < s) {
                st.pop();
                k--;
            }
            st.push(s);
        }
    }
    
    while (k != 0) {
        st.pop();
        k--;
    }
    
    while (st.size()) {
        answer += st.top();
        st.pop();
    }
    
    reverse(answer.begin(), answer.end());
    
    return answer;
}