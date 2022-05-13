package abstrac;
abstract class demo {
	public Demo()
	{
		System.out.println("Constructor of abstraction class");
		
	}
public void print() {
	System.out.println("inside print()of abstraction class");
}
public abstract void show();
}
	public class abstractEX extends Demo{
		public void show () {
		System.out.println("insided show (): overriden method ");
		
	}
	public static void main (String[]args) {
		
	}
