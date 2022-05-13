package foreach;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class examp {
public static void main(String args[]) {
	Map<Integer, String>hmap = new HashMap<Integer, String>();
	hmap.put(1,"aks");
	hmap.put(2,"kasa");
	hmap.put(3,"aasa");
	hmap.put(4,"sasa");
	hmap.put(5,"dasa");
	
	hmap.forEach((key,value)->System.out.println(key+"-"+value));
	Scanner sc=new Scanner (System.in);
	int s;
	System.out.println("enter the key:");
	s=sc.nextInt();
	hmap.forEach((key,value)->{
		if(key==s) {
			System.out.println("Value associated with key 4 is: "+value);
			
		}
	});
	Scanner	sc1=new Scanner(System.in);
	System.out.print("enter the value (name): ");
	String ss=sc1.nextLine();
	
	hmap.forEach((key,value)->{
		if(ss.equals(value)) {
			System.out.println("key associated with	value sasa is :"+key);
		}
		else
		{
			System.out.println("value not avaliable in the list");
		}
		
		});
}
}
