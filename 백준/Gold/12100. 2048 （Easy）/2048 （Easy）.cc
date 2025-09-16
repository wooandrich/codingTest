#include<bits/stdc++.h>
using namespace std;

const int MAX = 24;

int a[MAX][MAX];
int n,ret;

void back(int arr[MAX][MAX], int cnt) {
    if (cnt == 5) {
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                ret = max(ret, arr[i][j]);
            }
        }
        return;
    }

    for (int i=0;i<4;i++) {
        int arr2[MAX][MAX];
        fill(&arr2[0][0] , &arr2[0][0] + MAX * MAX, 0);
        // 아래, 위, 오른쪽, 왼쪽 순서
        if (i == 0) {
            for (int q=0;q<n;q++) {
                vector<int> temp;
                for (int p=n-1;p>=0;p--) {
                    if (arr[p][q]) temp.push_back(arr[p][q]);
                }
                if (temp.empty()) continue;
                for (int k=0;k < temp.size() - 1;k++) {
                    if (temp[k] == temp[k+1]) {
                        temp[k] *= 2;
                        temp[k+1] = 0;
                    }
                }
                while (find(temp.begin(), temp.end(), 0) != temp.end()) {
                    temp.erase(find(temp.begin(), temp.end(), 0));
                }
                for (int k = 0; k < temp.size(); k++) {
                    arr2[n - 1 - k][q] = temp[k];
                }
            }
        }
        else if (i == 1) {
           for (int q = 0;q<n;q++) {
               vector<int> temp;
               for (int p =0;p<n;p++) {
                   if (arr[p][q]) temp.push_back(arr[p][q]);
               }
               if (temp.empty()) continue;
               for (int k=0;k < temp.size() - 1;k++) {
                   if (temp[k] == temp[k+1]) {
                       temp[k] *= 2;
                       temp[k+1] = 0;
                   }
               }

               while (find(temp.begin(), temp.end(), 0) != temp.end()) {
                   temp.erase(find(temp.begin(), temp.end(), 0));
               }

               for (int k = 0; k < temp.size(); k++) {
                   arr2[k][q] = temp[k];
               }
           }
        }
        else if (i == 2) {
            for (int p=0;p<n;p++) {
                vector<int> temp;
                for (int q=n-1;q>=0;q--) {
                    if (arr[p][q]) temp.push_back(arr[p][q]);
                }
                if (temp.empty()) continue;
                for (int k=0;k < temp.size() - 1;k++) {
                    if (temp[k] == temp[k+1]) {
                        temp[k] *= 2;
                        temp[k+1] = 0;
                    }
                }

                while (find(temp.begin(), temp.end(), 0) != temp.end()) {
                    temp.erase(find(temp.begin(), temp.end(), 0));
                }
                for (int k = 0; k < temp.size(); k++) {
                    arr2[p][n - 1 - k] = temp[k];
                }
            }
        }
        else {
            for (int p=0;p<n;p++) {
                vector<int> temp;
                for (int q=0;q<n;q++) {
                    if (arr[p][q]) temp.push_back(arr[p][q]);
                }
                if (temp.empty()) continue;
                for (int k=0;k < temp.size() - 1;k++) {
                    if (temp[k] == temp[k+1]) {
                        temp[k] *= 2;
                        temp[k+1] = 0;
                    }
                }

                while (find(temp.begin(), temp.end(), 0) != temp.end()) {
                    temp.erase(find(temp.begin(), temp.end(), 0));
                }
                for (int k = 0; k < temp.size(); k++) {
                    arr2[p][k] = temp[k];
                }
            }
        }

        back(arr2, cnt + 1);
    }
}


int main() {
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    cin >> n;

    for (int i=0;i<n;i++) {
        for (int j=0;j<n;j++) {
            cin >> a[i][j];
        }
    }

    back(a, 0);

    cout << ret << '\n';





    return 0;
}
