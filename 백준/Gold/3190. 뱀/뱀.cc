#include<bits/stdc++.h>
using namespace std;

const int MAX = 104;
int n,k,l,ret;
int head_y,head_x, tail_y, tail_x;
int t;
string s;

deque<pair<int,string>> turn;
deque<pair<int,int>> snake;

int a[MAX][MAX];

int dy[] = {0,1,0,-1}; // 오른쪽, 아래, 왼쪽, 위
int dx[] = {1,0,-1,0};


int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    cin >> n >> k;

    for (int i=0;i<k;i++) {
        int y, x;

        cin >> y >> x;
        a[y-1][x-1] = -1;
    }

    cin >> l;

    for (int i=0;i<l;i++) {
        int time;
        string side;
        cin >> time >> side;

        turn.push_back({time,side});
    }

    head_y = 0, head_x=0, tail_y = 0, tail_x = 0;
    a[head_y][head_x] = 1;
    int turn_idx = 0;
    snake.push_back({head_y, head_x});

    while (1) {
        ret++;
        int ny = head_y + dy[turn_idx];
        int nx = head_x + dx[turn_idx];


        if (ny < 0 || ny >= n || nx < 0 || nx >= n) break;
        if (a[ny][nx] == 1) break;

        head_y = ny;
        head_x = nx;
        snake.push_front({head_y, head_x});

        if (a[ny][nx] != -1) {
            tie(tail_y, tail_x) = snake.back();
            a[tail_y][tail_x] = 0;
            snake.pop_back();
        }
        a[head_y][head_x] = 1;


        tie(t,s) = turn.front();
        if (ret == t) {
            if (s == "D") turn_idx = (turn_idx + 1) % 4;
            else turn_idx = (turn_idx + 3) % 4;
            turn.pop_front();
        }
    }


    cout << ret << '\n';






    return 0;
}
