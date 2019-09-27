points=30.0

#include<iostream>
#include<math.h>
#include<iomanip>
using namespace std;
void cas1(double suc,double fail,double m)
{
    double k;
    double j,res;
    k=1*pow(suc,0)*pow(fail,m)+m*pow(suc,1)*pow(fail,m-1)+m*(m-1)*0.5*pow(suc,2)*pow(fail,m-2);
    std::cout<<std::fixed<<std::setprecision(3)<<k<<endl;
    j=1*pow(suc,0)*pow(fail,m)+m*pow(suc,1)*pow(fail,m-1);
    res=1-j;
    std::cout<<std::fixed<<std::setprecision(3)<<res<<endl;
}
int main()
{
    double rej;
    double samp;
    double prej;
    double q;
    cin>>rej;
    cin>>samp;
    prej=rej/100;
    q=1-prej;
    cas1(prej,q,samp);


}
