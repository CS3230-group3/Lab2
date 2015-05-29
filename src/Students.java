import java.util.*;

public class Students 
{
	String firstName;
	String lastName;
	double score;
	Students partner;
	List<String> response = new ArrayList<String>();
	
	public Students(String firstName, String lastName, double score, Students partner, List response )
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.score = score;
		this.partner = partner;
		this.response = response;
	}
	
	public void Chat()
	{
		for(int i = 0; i <= response.size(); i++)
		{
			System.out.println(response.get(i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			System.out.println(partner.response.get(i));
		}
	}
	
}
