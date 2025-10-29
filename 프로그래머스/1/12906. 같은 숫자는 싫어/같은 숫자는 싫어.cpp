#include <bits/stdc++.h>

using namespace std;

stack<int> st;

vector<int> solution(vector<int> arr) 
{
    vector<int> answer;

    for (int n : arr) {
        if (st.empty()) st.push(n);
        else if (st.top() != n) st.push(n); 
    }
    
    while (st.size()) {
        answer.push_back(st.top());
        st.pop();
    }
    
    reverse(answer.begin(), answer.end());

    return answer;
}