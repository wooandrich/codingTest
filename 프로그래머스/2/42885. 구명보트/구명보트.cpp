#include <bits/stdc++.h>

using namespace std;

int solution(vector<int> people, int limit) {
    int answer = 0;
    
    sort(people.begin(), people.end());
    int left = 0;
    int right = people.size() - 1;
    
    while (left <= right) {
        answer++;
        
        if (people[left] + people[right] <= limit) left++;
        
        right--;
    }
    
    return answer;
}