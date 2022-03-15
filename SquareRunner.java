public class SquareRunner
{
	public SquareRunner()
	{

		Square square = (x)->{

			if(x%2==0)
			return true;

			return false;
		};
		System.out.println(square.checker(4));

	}
	public static void main(String[]args)
	{
		SquareRunner apps = new SquareRunner();
	}
}