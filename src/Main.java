import java.util.*;

public class Main{
	//testing .gitignore file
	public static void main(String[] args) 
	{
		List<String> s1List = new ArrayList<String>(Arrays.asList("Hello","It's a nice day","I like ice cream","I'm good with computers","Goodbye"));
		List<String> s2List = new ArrayList<String>(Arrays.asList("Hi","It's a awesome day","I like pie","I'm good at coding computers","Later"));
		List<String> s3List = new ArrayList<String>(Arrays.asList("Hola","It's a ok day","I like cake","I'm good at reading binary","Adios"));
		
		Set<Students> student = new HashSet<Students>();
		
		Students s2 = new Students("Tony","Alder",4.0,null,s2List);
		Students s1 = new Students("Chris","Strickland",4.0,s2,s1List);
		s2 = new Students("Tony","Alder",4.0,s1,s2List);
		
		student.add(s1);
		student.add(s2);
		System.out.println(student);
		
		for( Iterator<Students> it = student.iterator(); it.hasNext(); )
		{
			Students s = it.next();
			s.Chat();
		}
		
		//s1.Chat();
		//s2.Chat();
	}

}
