#include<iostream>
using namespace std;
int main()
{
  int radius,length;
  std::cin>>radius;
  std::cin>>length;
  int d=2*radius;
  if(d<=length)
  {
    std::cout<<"circle can be inside a square";
  }
  else
  {
    std::cout<<"circle cannot be inside a square";
  }
}