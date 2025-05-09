#include<bits/stdc++.h>
using namespace std;

/**
	팰린드롬 만들기
	
	문자열의 길이 홀/짝으로 나눈다
	1. 문자열의 길이가 홀수일경우
	* 1개의 문자는 홀수, 나머지 문자는 짝수여야함
	* map으로 각 문자별로 가져온다음 정렬
	* 전체 문자열 길이 / 2 만큼 for문 돌려서 각 문자 갯수 / 2 만큼 더하기 
	
	2. 문자열의 길이가 짝수일 경우
	* 모든 문자의 길이가 짝수여야함 
	
	(map) 은 key값 기준으로 자동으로 오름차순 정렬임! 
*/
string s; 
map<char, int> m;
string pre, fix;
string mid;
int main() {
	ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> s;
    
    for (char c : s) {
    	m[c]++;
	}
	
	bool sign = false;
	int one = 0;
	
	for (auto& it : m){
		if (s.size() % 2 == 0){ // s 길이가 짝수일때
			if(it.second % 2 == 1){
				sign = true;
				break;
			} 
		}else{ // 홀수일때 
			if (it.second % 2 == 1){
				one++;
			}
		} 
		 
	}
	
	
	
	if (s.size() % 2 == 1 && one != 1) sign = true;
	
	if (sign) {
		cout << "I'm Sorry Hansoo" << '\n';
	} else {
		for(auto& it : m){
			if(it.second % 2 == 1) mid = it.first;
			
			int i = it.second / 2;
			pre.append(i, it.first);

			fix.append(i, it.first);
			
		}
		reverse(fix.begin(), fix.end());
		cout << pre + mid + fix << '\n';
	}
    
	


	
	
    
    

    return 0;
}