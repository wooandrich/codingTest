#include<bits/stdc++.h>
using namespace std;

const int MAX = 1001;

int r,c,ret,hy,hx,fy,fx;

char a[MAX][MAX];
int fire[MAX][MAX];
int visited[MAX][MAX];
bool isFin;

int dy[] = {-1,1,0,0};
int dx[] = {0,0,-1,1};


int main() {
	ios::sync_with_stdio(false);
    cin.tie(nullptr);
    
	cin >> r >> c;
	
	queue<pair<int,int>> v;
	
	for (int i=0;i<r;i++){
		string temp;
		cin >> temp;
		for (int j=0;j<c;j++){
			a[i][j] = temp[j];
			if (a[i][j] == 'J') {
				hy = i;
				hx = j;
			} else if (a[i][j] == 'F') {
				fire[i][j] = 1;
				v.push({i,j});
			}
		}
	}
	
	
	while(!v.empty()){
		tie(fy,fx) = v.front();
		v.pop();
		
		for (int i=0;i<4;i++){
			int nfy = fy + dy[i];
			int nfx = fx + dx[i];
				
			if (nfy < 0 || nfy >= r || nfx < 0 || nfx >= c) continue;
			if (a[nfy][nfx] == '#') continue;
			if (fire[nfy][nfx]) continue;
			fire[nfy][nfx] = fire[fy][fx] + 1;
			v.push({nfy,nfx});
		}
	}
	
	
	queue<pair<int,int>> q;
	q.push({hy,hx});
	visited[hy][hx] = 1;
	
	while(!q.empty()){
		
		// 사람차례
		tie(hy, hx) = q.front();
		q.pop();
		
		if (hy == 0 || hy == r-1 || hx == 0 || hx == c-1) {
			cout << visited[hy][hx] << '\n';
			return 0;
		}
		
		for (int i=0;i<4;i++){
			int nhy = hy + dy[i];
			int nhx = hx + dx[i];
			
			if (nhy < 0 || nhy >= r || nhx < 0 || nhx >= c ) continue;
			if (a[nhy][nhx] == '#') continue;
			if (fire[nhy][nhx] != 0 && fire[nhy][nhx] <= visited[hy][hx] + 1) continue;
			if(visited[nhy][nhx]) continue;
			
			visited[nhy][nhx] = visited[hy][hx] + 1;
			q.push({nhy, nhx});
		}
		 
		 
	}

	
	cout << "IMPOSSIBLE" << '\n';

	






    return 0;
}
//
//문제
//지훈이는 미로에서 일을 한다. 지훈이를 미로에서 탈출하도록 도와주자!
//
//미로에서의 지훈이의 위치와 불이 붙은 위치를 감안해서 지훈이가 불에 타기전에 탈출할 수 있는지의 여부, 그리고 얼마나 빨리 탈출할 수 있는지를 결정해야한다.
//
//지훈이와 불은 매 분마다 한칸씩 수평또는 수직으로(비스듬하게 이동하지 않는다) 이동한다.
//
//불은 각 지점에서 네 방향으로 확산된다.
//
//지훈이는 미로의 가장자리에 접한 공간에서 탈출할 수 있다.
//
//지훈이와 불은 벽이 있는 공간은 통과하지 못한다.
//
//입력
//입력의 첫째 줄에는 공백으로 구분된 두 정수 R과 C가 주어진다. 단, 1 ≤ R, C ≤ 1000 이다. R은 미로 행의 개수, C는 열의 개수이다.
//
//다음 입력으로 R줄동안 각각의 미로 행이 주어진다.
//
//각각의 문자들은 다음을 뜻한다.
//
//#: 벽
//.: 지나갈 수 있는 공간
//J: 지훈이의 미로에서의 초기위치 (지나갈 수 있는 공간)
//F: 불이 난 공간
//J는 입력에서 하나만 주어진다.
//
//출력
//지훈이가 불이 도달하기 전에 미로를 탈출 할 수 없는 경우 IMPOSSIBLE 을 출력한다.
//
//지훈이가 미로를 탈출할 수 있는 경우에는 가장 빠른 탈출시간을 출력한다.