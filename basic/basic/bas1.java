package basic;

public class bas1 {
	public static void main(String arg[])
	{
		bas1 obj=new bas1();
		
		int a=11,b=20,s,d,mul;
		float div,mod;
		s=a+b;
		d=a-b;
		div=b/a;
		mul=a*b;
		mod=b%a;
		System.out.println("sum is "+s);
		System.out.println("diff is "+d);
		System.out.println("div is "+div);
		System.out.println("mul is "+mul);
		System.out.println("mod is "+mod);
		if(s!=d) {
			System.out.println("Both are differnet");
		}
		else {
		System.out.println("Both are same");
		}
	}
}
