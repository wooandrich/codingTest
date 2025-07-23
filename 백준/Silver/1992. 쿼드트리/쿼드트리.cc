#include <bits/stdc++.h>
using namespace std;


const int MAX = 65;
int dy[] = {-1,1,0,0};
int dx[] = {0,0,-1,1};
char graph[MAX][MAX];
int visited[MAX][MAX];

int n;
string ans;

string quard(int y, int x, int size) {
    if (size == 1) return string(1, graph[y][x]);

    char target = graph[y][x];
    string ret = "";

    for (int i=y;i<y+size;i++) {
        for (int j=x;j<x+size;j++) {
            if (target != graph[i][j]) {
                ret += "(";
                ret += quard(y, x, size / 2);
                ret += quard(y, x + size / 2, size / 2);
                ret += quard(y + size / 2, x, size / 2);
                ret += quard(y + size / 2, x + size / 2, size / 2);
                ret += ")";
                return ret;

            }
        }
    }
    return string(1, graph[y][x]);
 }



int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;


    for (int i=0;i<n;i++) {
        for (int j=0;j<n;j++) {
            cin >> graph[i][j];
        }
    }

    cout << quard(0,0,n) << '\n';

    
    







    

    
    

    




    
    
    

    
    return 0;
}