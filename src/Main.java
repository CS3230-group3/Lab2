import java.util.*;


public class Main {

	public static void main(String[] args) 
	{
		List<String> s1List = new ArrayList<String>(Arrays.asList("Hello","Nice Day"));
		List<String> s2List = new ArrayList<String>(Arrays.asList("Hi","Awesome Day"));
		
		Students s2 = new Students("Tony","Alder",4.0,null,s2List);
		Students s1 = new Students("Chris","Strickland",4.0,s2,s1List);
		s2 = new Students("Tony","Alder",4.0,s1,s2List);
		
		s1.Chat();
		s2.Chat();

	}

}
