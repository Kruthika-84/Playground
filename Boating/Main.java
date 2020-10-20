#include<iostream>
using namespace std;
int main()
{
  int bw,aw,cw,total;
  std::cin>>bw;
  std::cin>>aw;
  std::cin>>cw;
  total=((aw*75)+(cw*30));
  if(total<=bw)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }
}