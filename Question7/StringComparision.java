package Question7;
//With the help of method overriding perform the string comparison.
//User will input two string and your task is to compare both the string 
//one alphabets at a time.

import java.util.Scanner;

public class StringComparision {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first String");
	String s=sc.next();
	System.out.println("enter the second String");
	String  s1=sc.next();
	 int a=s.length();
	 int b=s1.length();
     for(int i=0;i<s.length();i++)
	{
    	 for(int j=i+1;j<s1.length();j++)
    	 { 	 
	    if (s.charAt(i) == s.charAt(j)) 
	    {
        System.out.println("Equal ");
        } 
	   else 
	   {
        System.out.println("Not Equal ");
        }
	}}	
}
}
