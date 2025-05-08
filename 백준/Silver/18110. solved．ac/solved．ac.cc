#include<bits/stdc++.h>
using namespace std;

int n;
double ret;
vector<double> v;

int main() {
	cin >> n;
	
	for (int i=0;i<n;i++){
		double temp;
		cin >> temp;
		ret += temp;
		v.push_back(temp);
	}
	
	int cnt = round(n * 0.15);
	
	sort(v.begin(), v.end());
	
	v.erase(v.begin(), v.begin() + cnt);
    v.erase(v.end() - cnt, v.end());
	
	double sum = 0;
	
	for(int i : v){
		sum += i;
	}
	
	int ans = round(sum / (n - cnt * 2));
	
	if (n == 0) ans = 0;
	cout << ans << endl;


	
	
    
    

    return 0;
}