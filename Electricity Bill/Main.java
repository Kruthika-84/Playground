#include<iostream>
using namespace std;
int main()
{
  int unit,cost,t;
  std::cin>>unit;
  if(unit<=200)
  {
   	cost=unit*0.5;
    std::cout<<"Rs."<<cost;
  }
  else if(unit<=400)
  {
    cost=unit*0.65;
    t=cost+100;
    std::cout<<"Rs."<<t;
  }
  else if(unit<=600)
  {
    cost=unit*0.80;
    t=cost+200;
    std::cout<<"Rs."<<t;
  }
  else
  {
    cost=unit*1.25;
    t=cost+425;
    std::cout<<"Rs."<<t;
  }
}