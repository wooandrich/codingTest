#include <bits/stdc++.h>

using namespace std;

bool checkMap(map<string, int> &m) {
    for (auto const& [key, val] : m) {
        if (val > 0) { // 아직 필요한 물건이 남아있다면
            return false; // 실패
        }
    }
    return true; // 모든 물건의 필요 수량이 0 이하가 되었으면 성공
}

int solution(vector<string> want, vector<int> number, vector<string> discount) {
    int answer = 0;
    map<string, int> m;

    for (int i=0;i<want.size();i++) {
        m[want[i]] = number[i];
    }
    // 0 ~ 9까지 체크
    for (int i=0;i<10;i++) {
        if (m.count(discount[i])) m[discount[i]]--;
    }

    if (checkMap(m)) answer++;

    // 슬라이딩 윈도우
    for (int start = 0, end = 10; end < discount.size(); start++, end++) {
        // 빠지는 상품 복구
        if (m.count(discount[start])) {
            m[discount[start]]++;
        }

        // 들어오는 상품 감소
        if (m.count(discount[end])) {
            m[discount[end]]--;
        }

        if (checkMap(m)) answer++;
    }




    return answer;
}