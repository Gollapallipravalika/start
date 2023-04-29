class Circle 
{
	static void add(double b, double r)
	{
		double area=(b*r*r);
		double square=r*r;
		System.out.println(area);
		System.out.println(square);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		add(3.14,4);
		System.out.println("main ends");
	}
}
