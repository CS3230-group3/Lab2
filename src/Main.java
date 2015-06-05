import java.util.*;

public class Main{
	
	public static void main(String[] args) 
	{
		List<String> s1List = new ArrayList<String>(Arrays.asList("Hello","It's a nice day","I like ice cream","I'm good with computers","Goodbye"));
		List<String> s2List = new ArrayList<String>(Arrays.asList("Hi","It's a awesome day","I like pie","I'm good at coding computers","Later"));
		List<String> s3List = new ArrayList<String>(Arrays.asList("Hola","It's an ok day","I like cake","I'm good at reading binary","Adios"));
		List<String> s4List = new ArrayList<String>(Arrays.asList("Good day","It's sunny today","I like cookies","I'm good at playing computer games","Farewell"));
		List<String> s5List = new ArrayList<String>(Arrays.asList("Aloha","It's a warm day","I like fruit","I'm good at typing","bye"));
		List<String> s6List = new ArrayList<String>(Arrays.asList("Greetings","It's good weather today","I like chocolate","I'm good at fixing computer bugs","Ciao"));
		
		//Set<Students> student = new HashSet<Students>();
		Set<Group> group = new HashSet<Group>();
		
		Students s1 = new Students("Chris","Strickland",4.0,null,s1List);
		Students s2 = new Students("Tony","Alder",4.0,null,s2List);
		Students s3 = new Students("Clint","Fowler",4.0,null,s3List);
		Students s4 = new Students("Mathew","Brewer",4.0,null,s4List);
		Students s5 = new Students("Kenneth","Adair",4.0,null,s5List);
		Students s6 = new Students("Moselle","Bair",4.0,null,s6List);
		Students s7 = new Students("Michael","Brown",4.0,null,s1List);
		Students s8 = new Students("Aaron","Calder",4.0,null,s2List);
		Students s9 = new Students("Tyler","Cazier",4.0,null,s3List);
		Students s10 = new Students("Jared","Elzinga",4.0,null,s4List);
		Students s11 = new Students("Andrew","Gray",4.0,null,s5List);
		Students s12 = new Students("Justin","Walker",4.0,null,s6List);
		
		Group g1 = new Group(s8,s10);
		Group g2 = new Group(s12,s7);
		Group g3 = new Group(s1,s2);
		Group g4 = new Group(s3,s5);
		Group g5 = new Group(s4,s9);
		Group g6 = new Group(s11,s6);
		//g1.partner.Chat();
		
		//g2.partner.Chat();
		// added duplicate student (s1), the result shows that it is ignored in the set collection 
		//Students s13 = new Students("Chris","Strickland",3.0,s2,s3List);
	
		/*
		student.add(s1);
		student.add(s2);
		student.add(s13);
		student.add(s3);
		student.add(s4);
		System.out.println(student);
		*/
	
		for( Iterator<Group> it = group.iterator(); it.hasNext(); )
		{
			Group g = it.next();
			System.out.println(g.partner.firstName);
			System.out.println(g.additionalPartner.firstName);
		}
		//System.out.println(g1.partner.firstName);
		//System.out.println(g1.additionalPartner.firstName);
		//s1.Chat();
		//s2.Chat();
	}

}
