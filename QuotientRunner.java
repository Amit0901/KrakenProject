public class QuotientRunner //implements Quotient
{
	public QuotientRunner()
	{
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