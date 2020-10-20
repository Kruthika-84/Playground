#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as;
  std::cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  int ft=fa-((fd*fa)/100)+fs;
  int st=sa-((sd*sa)/100)+ss;
  int at=aa-((ad*aa)/100)+as;
  std::cout<<"In Flipkart Rs."<<ft;
  std::cout<<"\n"<<"In Snapdeal Rs."<<st;
  std::cout<<"\n"<<"In Amazon Rs."<<at;
  if(ft<=st)
  {
    if(ft<=at)
    {
      std::cout<<"\n"<<"He will prefer Flipkart";
    }
    else
    {
      std::cout<<"\n"<<"He will prefer Amazon";
    }
  }
  else
  {
    std::cout<<"\n"<<"He will prefer Snapdeal";
  }
}