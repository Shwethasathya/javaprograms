package com.xworkz.techapti.boot;

import java.util.Arrays;

public class ContainSame {

static boolean areEqual(int array1[],int array2[]){

int a=array1.length;
int b=array2.length;

if(a!=b)
return false;

Arrays.sort(array1);
Arrays.sort(array2);


for(int i=0;i<a;i++){
	
	if(array1[i]!=array2[i])
		return false;
	//return true;
}
return true;
}
public static void main(String[] args){
	
	int[] array1={2,4,5,7,7};
	int[] array2={2,4,5,7,7};
	
	if(areEqual(array1,array2))
		
		System.out.println("yes");
	else
		System.out.println("no");			
	

}
}

