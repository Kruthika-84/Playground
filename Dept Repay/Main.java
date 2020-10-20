#include<iostream>
using namespace std;
int main()
{
  int p,r,y;
  float i,a,d,f;
  std::cin>>p;
  std::cin>>r;
  std::cin>>y;
  i=(p*y*r)/100;
  a=p+i;
  d=0.02*i;
  f=a-d;
  std::cout<<i;
  std::cout<<"\n"<<a;
  std::cout<<"\n"<<d;
  std::cout<<"\n"<<f;
}