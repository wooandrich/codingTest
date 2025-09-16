#include <bits/stdc++.h>
using namespace std;

vector<pair<string ,int>> v;
map<string, string> m;
string order, id, name;

vector<string> solution(vector<string> record) {
    vector<string> answer;

    for (string s : record) {
        vector<string> vt;
        string temp = "";
        order = "";
        id = "";
        name = "";
        for (char c : s) {
            if (c == ' ') {
                vt.push_back(temp);
                temp = "";
            } else {
                temp += c;
            }
        }
        vt.push_back(temp);
        order = vt[0];
        id = vt[1];
        if (order != "Leave") name = vt[2];

        if (order == "Enter") {
            m[id] = name;
            v.push_back({id, 1});
        } else if (order == "Leave") {
            v.push_back({id, 0});
        } else {
            m[id] = name;
        }
    }

    for (pair<string ,int> p : v) {
        string nickName = m[p.first];
        if (p.second == 1) {
            answer.push_back(nickName + "님이 들어왔습니다.");
        } else {
            answer.push_back(nickName + "님이 나갔습니다.");
        }
    }


    return answer;
}