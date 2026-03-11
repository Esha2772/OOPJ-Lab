class NotEligibleForEngineering extends RuntimeException
{
	NotEligibleForEngineering(String s)
	{
		super(s);
	}
}
class NotEligibleForVJIT extends RuntimeException
{
	NotEligibleForVJIT(String s)
	{
		super(s);
	}
}
class TSEngineeringAdmission
{
	public static void main(String [] args)
	{
	try{
		int TSEAMCET = Integer.parseInt(args[0]);
		if(TSEAMCET<50)
		{
			throw new NotEligibleForEngineering("Sorry u are not elligable for Engineering");
		}
		else if(TSEAMCET<70)
		{
			throw new NotEligibleForVJIT("Sorry u are not elligable for VJIT");
		}
		else
		{
			System.out.println("Welcome to VJIT-Thanks For Your Registration!");
		}
	}
		catch (NotEligibleForEngineering | NotEligibleForVJIT e)
		{
			System.out.println("Message:"+e.getMessage());
		}
		System.out.println("Rest of the code");
	}
}