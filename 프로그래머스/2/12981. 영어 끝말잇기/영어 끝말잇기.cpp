#include <bits/stdc++.h>


using namespace std;

int ret, a,b;
map<string, int> m;
char c;

vector<int> solution(int n, vector<string> words) {
    vector<int> answer;
    
    for (string word : words) {
        ret++;
        
        if (ret > 1 && c != word[0]) {
            a = ret % n;
            if (a == 0) a = n;
            b = ret / n;
            if (ret % n != 0) b++;
            answer.push_back(a);
            answer.push_back(b);
            break;
        }
        
        if (m[word] != 0) {
            a = ret % n;
            if (a == 0) a = n;
            b = ret / n;
            if (ret % n != 0) b++;
            answer.push_back(a);
            answer.push_back(b);
            break;
        }
            
        c = word[word.size() - 1];  
        m[word]++;
        
    }
    if (answer.size() == 0) {
        answer.push_back(0);
        answer.push_back(0);
    }

    return answer;
}