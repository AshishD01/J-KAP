package com.fil.JavaQuestion;

import java.util.Scanner;

public class SortStrings {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] words = {"Apple", "Apine", "Orange", "Pineapple"};
		for(int i =0; i<3; ++i) {
			for(int j=i+1; j<4; ++j) {
				if(words[i].compareTo(words[j])>0) {
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		System.out.println("In Dictionary Order:");
		for(int i=0; i<4; i++) {
			System.out.println(words[i]);
		}

	}

}



