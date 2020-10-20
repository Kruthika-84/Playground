#include<iostream>
int main()
{
  int maximum_weight,weight;
  std::cin>>weight;
  std::cin>>maximum_weight;
  if(weight>maximum_weight)
  {
    std::cout<<"Yes, you can enter.";
  }
  else if(weight==maximum_weight)
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else
  {
    std::cout<<"Sorry, you can't enter";
  }
}