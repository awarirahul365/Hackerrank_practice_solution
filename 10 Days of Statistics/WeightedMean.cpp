points=30.0

#include<iostream>
#include<iomanip>
using namespace std;
void wmean(double a[1000],double b[1000],int p)
{
    int k;
    double res[1000];
    double sum=0;
    double sumb=0;
    double result;
    for (k=0;k<p;k++)
    {
        res[k]=a[k]*b[k];
    }
    for (int l=0;l<p;l++)
    {
        sum=sum+res[l];
    }
    for (int m=0;m<p;m++)
    {
        sumb=sumb+b[m];
    }
    result=sum/sumb;
    std::cout << std::fixed << std::setprecision(1) << result;

}
int main()
{
    int n;
    cin>>n;
    double x[1000];
    double w[1000];
    for (int i=0;i<n;i++)
    {
        cin>>x[i];
    }
    for (int j=0;j<n;j++)
    {
        cin>>w[j];
    }
    wmean(x,w,n);
}

