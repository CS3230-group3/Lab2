import java.util.*;

public class Students // Here is a test 
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
	
}
