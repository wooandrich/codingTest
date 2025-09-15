#include <bits/stdc++.h>

using namespace std;

bool cmp(string a, string b) {
    string a_head = "";
    string b_head = "";
    string a_tempNum = "";
    string b_tempNum = "";
    int a_num = 0;
    int b_num = 0;
    int a_ok = 0;
    int b_ok = 0;
    
    for (char i : a) {
        if (!isdigit(i) && a_ok == 0) {
            // 숫자가 아닌 모든 문자를 HEAD에 포함 (대소문자는 소문자로 변환)
            a_head += tolower(i);
        }
        else if (isdigit(i)) {
            a_tempNum += i;
            a_ok = 1;
        } 
        else if (!isdigit(i) && a_ok == 1) {
            break; // NUMBER 이후 숫자가 아닌 문자가 나오면 TAIL 시작
        }
    }
    
    for (char i : b) {
        if (!isdigit(i) && b_ok == 0) {
            // 숫자가 아닌 모든 문자를 HEAD에 포함 (대소문자는 소문자로 변환)
            b_head += tolower(i);
        }
        else if (isdigit(i)) {
            b_tempNum += i;
            b_ok = 1;
        }
        else if (!isdigit(i) && b_ok == 1) {
            break; // NUMBER 이후 숫자가 아닌 문자가 나오면 TAIL 시작
        }
    }
    
    // 안전한 숫자 변환
    if (!a_tempNum.empty()) {
        a_num = stoi(a_tempNum);
    }
    if (!b_tempNum.empty()) {
        b_num = stoi(b_tempNum);
    }
    
    if (a_head == b_head) {
        return a_num < b_num;
    }
    return a_head < b_head;
}

vector<string> solution(vector<string> files) {
    vector<string> answer;

    stable_sort(files.begin(), files.end(), cmp);



    return files;
}