package day11;

import java.util.Arrays;

public class FindSmalleerNumberinArray {

	public static void main(String[] args) {
		//removing dollar sign
		
		String price="$200.98";
		String price1=price.replace("$","");//remove the dollar sign
		System.out.println(Double.parseDouble(price1)); //converted to number
		
		
		//find smallest number in array
		
		int a[]= {500,200,100,700,400};
		Arrays.sort(a);
		System.out.println("smallest number:"+a[0]);
		
		System.out.println("$"+a[0]);
		}
		
		
		
		
		
		
	}


