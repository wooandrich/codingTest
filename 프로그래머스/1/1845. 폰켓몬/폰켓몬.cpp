#include <bits/stdc++.h>
using namespace std;

set<int> s;

int solution(vector<int> nums)
{
    int answer = 0;

    for (int n : nums) {
        s.insert(n);
    }
    
    
    return min(s.size(), nums.size()/2);
}