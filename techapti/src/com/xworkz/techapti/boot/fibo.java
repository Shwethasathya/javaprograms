package com.xworkz.techapti.boot;

class Fibo{

public static void main(String[] args){

//	Scanner sc=new Scanner(System.in);
int a=1,b=1,c;
int count=10;

System.out.println(a+" "+b);

for(int i =0;i<count;i++){

c=a+b;
a=b;
b=c;

System.out.println(c);

}
}
}
