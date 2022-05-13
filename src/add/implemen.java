package add;
interface a
{
	public void Add ();
}
interface b
{
 public void Sub ();
}
interface c
{
	public void mul();
}
interface d
{
	public void Div();
}
interface e
{
public void String();
}
public class implemen implements a,b,c,d 
{
	int a=7,b=26 ;

public void Add ()
{
	System.out.println(a+b);
}
public void Sub ()
{
	System.out.println(a-b);
}
public void Mul()
{
	System.out.println(a*b);
}
public void Div()
{
	System.out.println(a/b);
}
public void String()
{
System.out.println("this is string");
}
public static void main(String args[]) {
	implemen obj=new implemen();
     obj.Add();
     obj.Sub();
     obj.Mul();
     obj.Div();
     obj.String();
}
}




