#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int petrol,distance;
  std::cin>>mileage;
  std::cin>>petrol;
  std::cin>>distance;
  int d=mileage*petrol;
  if(distance<=d)
  {
    std::cout<<"Can reach";
  }
  else
  {
    std::cout<<"Cannot reach";
  }
}