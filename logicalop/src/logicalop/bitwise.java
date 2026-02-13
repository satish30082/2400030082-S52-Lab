package logicalop;

public class bitwise {
	public static void main(String arg[]) {
		
		int a=64,b=12;
		int s,d,f,g,h;
		s=a&b;
		f=a|b;
		d=a^b;
		g=~a;
		h=~b;
		System.out.println("and "+s);
		System.out.println("or "+f);
		System.out.println("cap "+d);
		System.out.println("nag of a "+g);
		System.out.println("nag of b "+s);
		System.out.println("left shift of a "+(a<<2));
		System.out.println("left shift of b "+(b<<2));
		System.out.println("right shift of a "+(a>>2));
		System.out.println("right shift of b "+(b>>2));
		System.out.println("right shift of a "+(a>>>2));
	}

}
