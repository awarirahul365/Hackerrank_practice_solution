points=10.0

#include<stdio.h>
void fun(int *x,int *y)
{
    int sum=*x+*y;
    printf("%d\n",sum);
    if(*x>*y)
    {
        int b2=*x-*y;
        printf("%d\n",b2);
    }
    else if(*y>*x)
    {
        int b3=*y-*x;
        printf("%d\n",b3);
    }


}
int main()
{
    int a,b;
    scanf("%d",&a);
    scanf("%d",&b);
    int *p1;
    p1=&a;
    int *p2;
    p2=&b;
    fun(p1,p2);
}
