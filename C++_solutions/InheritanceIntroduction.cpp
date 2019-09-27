points=20.0

#include<iostream>
using namespace std;
class triangle
{
    public:
    void get1()
    {
        cout<<"I am a triangle"<<"\n";
    }

};
class isosceles:public triangle
{
    public:
    void get2()
    {
        cout<<"I am an isosceles triangle"<<"\n";
        cout<<"In an isosceles triangle two sides are equal"<<"\n";
    }

};
int main()
{
     isosceles t;
     t.get2();
     t.get1();

}
