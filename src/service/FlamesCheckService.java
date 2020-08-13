
package service;
import java.io.BufferedReader;


// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService {
	public char findFlames(String name1, String name2) {
		name1 = name1.toLowerCase();  //making all characters to lowercase
		name2 = name2.toLowerCase(); 
		StringBuffer str1 = new StringBuffer(name1);
		StringBuffer str2 = new StringBuffer(name2);
		int len1 = str1.length();
		int len2 = str2.length();
		for(int i =0; i< len1; i++) {
			char a = str1.charAt(i);
			for(int j =0; j< len2; j++) { 
				char b = str2.charAt(j);
				if(a == b) {
					str1.deleteCharAt(i);       
					str2.deleteCharAt(j);
					i = 0;                         
					j=0;
				    len1 = str1.length();
					len2 = str2.length();
					a = str1.charAt(0);
					}
				}
		}
		int len = len1+len2;  
		int a = len -1;    
		StringBuffer str3 = new StringBuffer("flames");
		int len3 = str3.length();
		for(int k =0; k<5; k++) {    
			if(a >= len3) {          
				a = a % len3;
			}
				str3.deleteCharAt(a);
				len3 = str3.length();
				a = a+len-1;
				
		}
		
		char result = str3.charAt(0);
		return result;
		
	}
}