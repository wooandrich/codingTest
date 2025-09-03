#include <bits/stdc++.h>

using namespace std;

map<char,int> m;


string solution(vector<string> survey, vector<int> choices) {
    string answer = "";

    for (int i=0;i<survey.size();i++) {
        string s = survey[i];
        int choice = choices[i];

        if (choice == 4) continue;

        char a = s[0];
        char b = s[1];

        if (choice == 1 || choice == 2 || choice == 3) {
            m[a] += (4 - choice);
        } else {
            m[b] += (choice - 4);
        }


    }

    (m['R'] >= m['T']) ? answer += "R" : answer += "T";
    (m['C'] >= m['F']) ? answer += "C" : answer += "F";
    (m['J'] >= m['M']) ? answer += "J" : answer += "M";
    (m['A'] >= m['N']) ? answer += "A" : answer += "N";





    return answer;
}