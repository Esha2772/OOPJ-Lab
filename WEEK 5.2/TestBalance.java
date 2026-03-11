import MyPack.Balance;
class TestBalance
{
	public static void main(String [] args)
	{
		Balance test=new Balance("VJIT",100000);
		Balance test1=new Balance("CBIT",-1);
		test.show();
		test1.show();
	}
}
