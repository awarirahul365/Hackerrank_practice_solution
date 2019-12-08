#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int t;
    cin>>t;
    int arr[1000];
    for(int i=0;i<t;i++)
    {
        cin>>arr[i];
    }
    int sum=0;
    int a[1000];
    for(int i=0;i<t;i++)
    {
        for(int j=1;j<arr[i]+1;j++)
        {
            int temp1,temp2;
            int res;
            temp1=pow(j,2);
            temp2=pow(j-1,2);
            res=temp1-temp2;
            sum=sum+res;
        }
        a[i]=sum;
        sum=0;

    }
    for(int i=0;i<t;i++)
    {
        cout<<a[i]<<"\n";

    }
}
