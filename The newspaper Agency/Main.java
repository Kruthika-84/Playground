#include<iostream>
using namespace std;
int main()
{
  int w,x,y,profit;
  std::cin>>w;
  std::cin>>x;
  std::cin>>y;
  profit=((w*x)-(y*w))-100;
  std::cout<<profit;
}