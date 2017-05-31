package walker;

public class Sequences
{
	public static void main(String[] args)
    	{
		if(args.length != 2)
		{
			if(args.length < 2)
				System.out.println("\nMissing arguments\n");
			else System.out.println("\nToo many arguments given\n");
			System.exit(3);
		}
		else if(!(args[0].equalsIgnoreCase("lazy") || args[0].equalsIgnoreCase("triangle")))
		{
			System.out.println("\nEnter lazy or triangle\n");
			System.exit(1);
		}
		else
		{
			try 
			{
				int num = Integer.parseInt(args[1]);
				if(num < 0)
				{
					System.out.println("\nPositive integers only\n");
					System.exit(2);
				}
				if(args[0].equalsIgnoreCase("lazy"))
				{
					int result = lazy(num);
					System.out.println("Lazy(" + num + ") = " + result);
				}
				else 
				{
					int result = tri(num);
					System.out.println("Tri(" + num + ") = " + result);
				}
					
			}
			catch (NumberFormatException ex)
			{
				System.out.println("\nEnter an integer\n");
				System.exit(2);
			}
		}
    	}
	
	public static int tri(int num) 
	{
		int total = 0;
		for(int i = num; i > 0; i--)
			total += i;
		
		return total;
	}
	
	public static int lazy(int num)
	{
		int p = (num*num + num + 2)/2;
		return p;
	}
}
