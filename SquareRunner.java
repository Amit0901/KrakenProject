public class SquareRunner
{
	public SquareRunner()
	{

	//Lamda expression for a Square method

		Square square = (x)->{

		int sqr = (int) Math.sqrt(x);
		return ((sqr - Math.floor(sqr)) == 0);   
		};

		//Prints out the Lamda function
		System.out.println(square.checker(4));

	}
	public static void main(String[]args)
	{
		SquareRunner apps = new SquareRunner();
	}



}
