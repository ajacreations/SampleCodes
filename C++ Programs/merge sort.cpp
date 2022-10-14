#include <iostream>
#include<vector>
using namespace std;
void merge(vector<int> &arra,int s,int e){
    int i=s;
    int mid=(s+e)/2;
    int j=mid+1;
    vector<int> temp;
    while(i<=mid and j<=e){
        if(arra[i]<arra[j]){
            temp.push_back(arra[i]);
            i++;
        }
        else{
            temp.push_back(arra[j]);
            j++;
        }
    }
    //copy remaining elements from first array
    while(i<=mid){
        temp.push_back(arra[i++]);
    }
    //or copy remaining elements from the second array
    while(j<=e){
        temp.push_back(arra[j++]);
        
    }
    //copy back from temp to original array
    int k=0;
    for(int idx=s;idx<=e;idx++){
        arra[idx]=temp[k++];
    }
    return;
}
void merge_sort(vector<int> &arr,int s,int e){
    //base case
    if(s>=e){
        return;
    }
    //rec case
    int mid=(s+e)/2;
    merge_sort(arr,s,mid);
    merge_sort(arr,mid+1,e);
    return merge(arr,s,e);

}
int main() {
    vector<int> arr{10,5,2,0,7,6,4};
    int s=0;
    int e=arr.size()-1;
    merge_sort(arr,s,e);
    for(int x:arr){
        cout<<x<<" ";
    }
    
}
