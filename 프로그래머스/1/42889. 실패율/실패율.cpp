#include <bits/stdc++.h>

using namespace std;

double a[504];
vector<pair<int,double>> temp;

bool solve(pair<int,double> a, pair<int,double> b) {
    if (a.second == b.second) return a.first < b.first;
    return a.second > b.second;
}

vector<int> solution(int N, vector<int> stages) {
    vector<int> answer;

    double people = stages.size();

    for (int stage : stages) a[stage]++;

    for (int i=1;i<=N;i++) {
        double rate;
        if (people == 0) rate = 0;
        else {
            rate = a[i] / people;
            people -= a[i];
        }
        

        temp.push_back({i, rate});
    }

    sort(temp.begin(), temp.end(), solve);

    for (pair<int,double> result : temp) answer.push_back(result.first);


    return answer;
}