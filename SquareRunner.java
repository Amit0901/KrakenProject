public class SquareRunner
{
	public SquareRunner()
	{

	//Lamda expression for a Square method

		Square square = (x)->{

			if(x%2==0)
			return true;

			return false;
		};

		//Prints out the Lamda function
		System.out.println(square.checker(4));

	}
	public static void main(String[]args)
	{
		SquareRunner apps = new SquareRunner();
	}



}