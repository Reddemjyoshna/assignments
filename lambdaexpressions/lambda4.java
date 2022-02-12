package lambdaassignments;
import java.util.*;
import java.util.stream.Collectors;
public class lambda4 {

	public static void main(String[] args) {
		ArrayList<String> s= new ArrayList<String>();
		s.add("jyoshnar");
		s.add("capgemini");
		s.add("assignments");
		s.add("lambda");
		s.add("expressions");
		s.add("streams");
		s.add("mongodb");
		s.add("gitgithub");
		System.out.println(s);
		s.removeIf(w -> w.length()%2 == 1);
		System.out.println(s);
	}

}