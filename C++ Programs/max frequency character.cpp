#include<iostream>
#include<algorithm>
#include<cstring>
using namespace std;
int max_frequency(char s[]){
	int freq[26]={0};
	int n=strlen(s);
	int max=0;
	int result;
	for(int i=0;i<n;i++){
		freq[s[i]-'a']++;
	}
	for(int i=0;i<26;i++){
		if(freq[i]>max){
			max=freq[i];
			result=i+'a';
		}
	}
	return result;
}
int main() {
	char s[1000];
	cin.getline(s,1000);
	cout<<max_frequency(s);
	return 0;
}
