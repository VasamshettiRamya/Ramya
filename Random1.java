import java.util.Random;
public class Random1 {
	public static void main(String args[])
	{
		int account;
		Random r=new Random();
		account =r.nextInt();
		r.setSeed(10);
		System.out.println(Math.abs(account));
	}
}
		

		
		
		

	


