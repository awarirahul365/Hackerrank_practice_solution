points=30.0

#include<iostream>
#include<math.h>
#include<iomanip>
using namespace std;
void sd(double a[1000],double m,double p)
{
    double b[1000];
    double sumres=0;
    double result;
    for (int k=0;k<p;k++)
    {
        b[k]=pow(a[k]-m,2);
    }
    for (int l=0;l<p;l++)
    {
        sumres=sumres+b[l];
    }
    result=pow(sumres/p,0.5);
    std::cout << std::fixed << std::setprecision(1) << result;


}
int main()
{
    int n;
    cin>>n;
    double arr[1000];
    for (int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    double sum=0;
    double mean;
    for (int i=0;i<n;i++)
    {
        sum=sum+arr[i];
    }
    mean=sum/n;
    sd(arr,mean,n);
}

