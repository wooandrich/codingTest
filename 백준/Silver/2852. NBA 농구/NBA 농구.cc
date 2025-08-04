#include <bits/stdc++.h>
using namespace std;

int n, score_team, one, two;
string score_time, score_prev;

int one_sum, two_sum;

string printTime(int ret) {
    string h = "00" + to_string(ret / 60);
    string m = "00" + to_string(ret % 60);

    return h.substr(h.size() - 2, 2) + ":" +  m.substr(m.size() - 2, 2);
}

int changeToInt(string time) {
    return stoi(time.substr(0,2)) * 60 + stoi(time.substr(3,2));
}

void go(int &sum, string s) {
    sum += (changeToInt(s) - changeToInt(score_prev));
}


int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;

    for (int i=0;i<n;i++) {
        cin >> score_team >> score_time;

        if (one > two) go(one_sum, score_time);
        else if (two > one) go(two_sum, score_time);

        score_team == 1 ? one++ : two++;

        score_prev = score_time;
    }
    if (one > two) go(one_sum, "48:00");
    else if (two > one) go(two_sum, "48:00");

    cout << printTime(one_sum) << '\n';
    cout << printTime(two_sum) << '\n';

    

    
    







    

    
    

    




    
    
    

    
    return 0;
}