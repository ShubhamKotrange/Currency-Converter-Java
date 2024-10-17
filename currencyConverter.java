import java.util.Scanner;
class currencyConverter
{
	public static void main(String [] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Know your currency Rate");
		System.out.println();
		System.out.print("Enter an amount(INR):");
		float amount=sc.nextFloat();
		System.out.println("1.USD 2.EUR 3.GBP 4.KWD 5.JPY 6.AUD 7.RUB 8.CNY 9.NEZ 10.CAD");
		String curr=sc.next().toLowerCase();


		if(curr.equals("usd"))
		{
			float usd =amount/83.96f;
			System.out.println(amount+"INR = " +usd+"USD");
		}
		else if(curr.equals("eur"))
		{
			float eur =amount/92.78f;
			System.out.println(amount+"INR = " +eur+"EUR");
		}
		else if(curr.equals("gpb"))
		{
			float gpb =amount/110.117f;
			System.out.println(amount+"INR = " +gpb+"GBP");
		}
		else if(curr.equals("kwd"))
		{
			float kwd =amount/274.70f;
			System.out.println(amount+"INR = " +kwd+"KWD");
		}



		else if(curr.equals("jpy"))
		{
			float jpy =amount/0.578236f;
			System.out.println(amount+"INR = " +jpy+"JPY");
		}
		else if(curr.equals("aud"))
		{
			float aud =amount/56.3402f;
			System.out.println(amount+"INR = " +aud+"AUD");
		}
		else if(curr.equals("rub"))
		{
			float rub =amount/0.950437f;
			System.out.println(amount+"INR = " +rub+"RUB");
		}
		else if(curr.equals("cny"))
		{
			float cny =amount/11.8044f;
			System.out.println(amount+"INR = " +cny+"CNY");
		}
		else if(curr.equals("nez"))
		{
			float nez =amount/274.70f;
			System.out.println(amount+"INR = " +nez+"NEZ");
		}
		else if(curr.equals("cad"))
		{
			float cad =amount/61.9468f;
			System.out.println(amount+"INR = " +cad+"CAD");
		}
		else{
			System.out.println("Wrong Currency Entered");
		}
	}

	
}