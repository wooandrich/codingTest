#include <bits/stdc++.h>

using namespace std;

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer;
    
    for (vector<int> command : commands) {
        vector<int> temp;
        int i = command[0] - 1;
        int j = command[1] - 1;
        int k = command[2] - 1;
        
        
        for (int start = i; start<=j;start++){
            temp.push_back(array[start]);
        }
        sort(temp.begin(), temp.end());
        
        answer.push_back(temp[k]);
    }
    
    
    return answer;
}