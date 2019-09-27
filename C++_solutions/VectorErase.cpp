points=10.0


#include<iostream>
#include<vector>
using namespace std;
int main()
{
    int n;
    int i,j;
    vector<int>v;
    cin>>n;
    for (i=0;i<n;i++)
    {
        cin>>j;
        v.push_back(j);
        j=0;
    }
    int k;
    cin>>k;
    v.erase(v.begin()+k-1);
    int a,b;
    cin>>a;
    cin>>b;
    v.erase(v.begin()+a-1,v.begin()+b-1);
    cout<<v.size()<<endl;
    for (i=0;i<v.size();i++)
    {
        cout<<v[i]<<" ";
    }

}

