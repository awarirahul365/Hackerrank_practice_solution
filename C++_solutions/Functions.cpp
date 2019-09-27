points=10.0

#include<iostream>
using namespace std;
void great(int w,int x,int y,int z)
{
    int arr[100];
    arr[0]=w;
    arr[1]=x;
    arr[2]=y;
    arr[3]=z;
    int i;
    int highest=arr[0];
    for (i=0;i<4;i++)
    {
        if (arr[i]>=highest)
        {
            highest=arr[i];
        }
    }
    cout<<highest;
}
int main()
{
    int a,b,c,d;
    cin>>a;
    cin>>b;
    cin>>c;
    cin>>d;
    great(a,b,c,d);
}
