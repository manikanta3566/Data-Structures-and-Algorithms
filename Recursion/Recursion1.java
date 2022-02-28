//TowerOfHanoi
package com.dsa.recursion;

public class Recursion1{
	public static void towerOfHanoi(int n,String src,String helper,String dest) {
		if(n==1) {
			System.out.println(n +" Disk transfered to "+src+" to "+dest);
			return;
		}
		towerOfHanoi(n-1,src, dest,helper );
		System.out.println(n +" Disk transfered to "+src+" to "+dest);
		towerOfHanoi(n-1, helper, src, dest);
	
	}
	public static void main(String[] args) {
		towerOfHanoi(2, "S", "H", "D");
	}
	
}
