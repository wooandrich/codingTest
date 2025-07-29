#include <bits/stdc++.h>
using namespace std;


vector<char> v = {'a', 'e', 'i', 'o', 'u'};
int mCnt, jCnt;
char nextWord;
bool findM, check;



int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    while (true) {
        string password;
        cin >> password;

        mCnt = 0;
        jCnt = 0;
        nextWord = '1';
        findM = false;
        check = false;

        

        if (password == "end") break;

        for (auto i : password) {
            if ( count(v.begin(), v.end(), i) == 1 ) {

                // 모음일때
                findM = true;
                mCnt += 1;
                jCnt = 0;

                if (mCnt == 3) {
                    check = true;
                    break;
                }

                if ( i == nextWord && i != 'e' && i != 'o' ) {
                    check = true;
                    break;
                }

            } else {
                mCnt = 0;
                jCnt += 1;

                if (jCnt == 3) {
                    check = true;
                    break;
                }

                if (i == nextWord) {
                    check = true;
                    break;
                }
            }

            nextWord = i;


        }

        if ( findM == true && check == false ) {
            cout << "<" << password << "> is acceptable." << '\n';
        } else {
            cout << "<" << password << "> is not acceptable." << '\n';
        }
    }

    

    
    







    

    
    

    




    
    
    

    
    return 0;
}