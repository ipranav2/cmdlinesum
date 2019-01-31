class CommandLineSum
{
	public static void main(String S[])
	{
		System.out.println("welcome");
		int sum=0;
		int x;
		for(int i=0; i<S.length;i++)
		{
			x= Integer.parseInt(S[i]);
			sum=sum+x;
		}
	System.out.println("sum= "+sum);
	}
}	
