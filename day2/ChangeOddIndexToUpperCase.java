package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name ="changeme";
 char[] chars = name.toCharArray();
 for (int i=0;i<=chars.length-1;i++) 
 {
		 if (i%2!=0)
		 {
			 String str = String. valueOf(chars[i]);
			 System.out.println(str.toUpperCase());
		 }
		 
		 
		 
		 
	 }
	
	}}
	 


//1,3,5,7

//HNEE

//0 2 4 8

//024567