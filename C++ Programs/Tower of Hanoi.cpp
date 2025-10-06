#include<iostream>
using namespace std;

void move(int n,char src,char destination,char helper){
	//base case
	if(n==0){
		return;
	}
	//recursive case
	//move n-1 disks from source to helper
	move(n-1,src,helper,destination);
	cout<<"moving ring "<<n<<" from "<<src<<" to "<<destination<<endl;
	move(n-1,helper,destination,src);
	
}

int main(){
	int n;
	cin>>n;
	
	move(n,'A','B','C');
	
}

