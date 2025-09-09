#include <bits/stdc++.h>

using namespace std;

string s,temp;

bool isPrime(string s_num) {
    long long num = stoll(s_num);
    if (num == 1) return false;

    long long end = sqrt(num);

    for (int i=2;i<=end;i++) {
        if (num % i == 0) return false;
    }

    return true;
}

int solution(int n, int k) {
    int answer = 0;

    while (n > 0) {
        s += to_string(n % k);
        n /= k;
    }

    reverse(s.begin(), s.end());

    for (int i=0;i<s.size();i++) {
        if (s[i] == '0') {
            if (temp.size() > 0 && isPrime(temp)) answer++;
            temp = "";
        }
        else {
            temp += s[i];
        }
    }

    if (temp.size()) {
        if (isPrime(temp)) answer++;
    }

    return answer;
}