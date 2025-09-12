#include <bits/stdc++.h>

using namespace std;

string hm, sign;
int carNum, m;
set<int> cnt;

vector<int> solution(vector<int> fees, vector<string> records) {
    vector<int> answer;

    vector<pair<int,int>> carPrice(10001);
    vector<pair<int,int>> carTime(10001);

    for (string info : records) {
        hm = info.substr(0, 5);
        carNum = stoi(info.substr(6, 4));
        sign = info.substr(11, 2);

        m = stoi(hm.substr(0,2)) * 60 + stoi(hm.substr(3, 2));

        if (sign == "IN") {
            carTime[carNum].first = 1;
            carTime[carNum].second = m;
            cnt.insert(carNum);
        } else {
            carTime[carNum].first = 0;
            carPrice[carNum].second += m - carTime[carNum].second;

        }
    }

    for (int i=0;i<10000;i++) {
        if (carTime[i].first == 1) {
            int lastMin = 23 * 60 + 59;
            carPrice[i].second += (lastMin - carTime[i].second);
        }
    }

    for (int i=0;i<10000;i++) {
        if (carPrice[i].second > 0) {
            carPrice[i].first += fees[1];
            carPrice[i].second -= fees[0];

            if (carPrice[i].second > 0) {
                int result = 0;
                if (carPrice[i].second % fees[2] != 0) {
                    result = carPrice[i].second / fees[2] + 1;
                } else {
                    result = carPrice[i].second / fees[2];
                }
                carPrice[i].first += (result * fees[3]);
            }

        }
    }

    for (int result : cnt) {
        answer.push_back(carPrice[result].first);
    }





    return answer;
}