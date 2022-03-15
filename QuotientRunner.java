public class QuotientRunner //implements Quotient
{
	public QuotientRunner()
	{
	//It took a while, but I learned how to make a lambda function and how to use it with an interface.
		Quotient q = (float a,float b)->
		{
			System.out.printf("%.3f", a/b);

		};
		q.printQuotient(6,3);


	}
	public static void main(String[]args)
	{
			QuotientRunner app = new QuotientRunner();
	}
}