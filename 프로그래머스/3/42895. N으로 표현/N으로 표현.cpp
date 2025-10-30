#include <bits/stdc++.h>

using namespace std;

vector<unordered_set<int>> v(9);

int solution(int N, int number) {
    for (int i=1;i<=8;i++) {
        int repeatN = stoi(string(i, (char)(N + '0')));
        v[i].insert(repeatN);

        for (int j=1;j<i;j++) {
            for (int a : v[j]) {
                for (int b : v[i - j]) {
                    v[i].insert(a + b);

                    v[i].insert(a - b);

                    v[i].insert(a * b);

                    if (b) v[i].insert(a / b);
                }
            }
        }
        if (v[i].count(number)) return i;
    }






    return -1;
}