package assignment;

public class strpro {
	public static void main (String[] args) {
		String name1="akshay";
		String name2="gandhare";
		String name3="developer";
		String name4="engg";
		System.out.println(name1);
		//length string
		int length=name1.length();
		System.out.println("length"+length);
		// join two string
		System.out.println(name1+name2);
		//compaire two string
		int result;
		result=name1.compareTo(name2);
		System.out.println(result);
		//to lower case
		System.out.println("LowerCase="+name3.toLowerCase());
		//substring
		System.out.println(name1.substring(0,4));
		//upper case
		System.out.println("UpperCase="+name3.toUpperCase());
		//replace
		String str1="abc";
		System.out.println(str1.replace('a','z'));
		//chartAt method returns the character at the specified index
		System.out.println(name2.charAt(4));
		String str2="write a program";
		System.out.println(str2.trim());
		//is empty check
		String str3="";
		System.out.println("str2 is empty= "+str2.isEmpty());
		System.out.println("str3 is empty= "+str3.isEmpty());
		//format()
		String formatStr=String.format("Student name:%s",name1);
				System.out.println(formatStr);
				//intering string intern ()
				System.out.println(str1==str2);
				System.out.println("Hashcode of Name:akshay  "+name1.hashCode());
				System.out.println("Hashcode of Name:akshay "+name2.hashCode());
				
		
	}
	

}
