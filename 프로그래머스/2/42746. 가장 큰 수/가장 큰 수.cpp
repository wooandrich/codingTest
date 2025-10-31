#include <bits/stdc++.h>

using namespace std;

vector<string> v;

bool cmp(string a, string b){
    return a + b > b + a;
}

string solution(vector<int> numbers) {
    string answer = "";
    
    for (int n : numbers) {
        v.push_back(to_string(n));
    }
    
    sort(v.begin(), v.end(), cmp);
    
    
    for (string s : v) answer += s;
    
    return answer[0] == '0' ? "0" : answer;
}