package inclasschapter12Thebeasteagle;

public class GoToFar {
	
	public static void main(String[] args) {
		int[] iLoveNumbers = {1,2,3,4,5};
		try 
		{
			for(int i=0; i<=5; i++)
			{
				System.out.print(iLoveNumbers[i] + " ");
			}
		}
		catch (ArrayIndexOutOfBoundsException Exception)
		{
			System.out.println("Now you have gone too far...");
		}
	}
}
