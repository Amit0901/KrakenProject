import java.lang.Math;
public class SquareRunner
{
	public SquareRunner()
	{

	//Lamda expression for a Square method

		Square square = (x)->{

		double sqr =  Math.sqrt(x);
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
