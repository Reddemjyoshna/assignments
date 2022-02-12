import java.util.ArrayList;
import java.util.List;

public class question6 {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("alpha");
		s.add("bravo");
		s.add("charlie");
		s.add("delta");
		s.add("echo");
		s.add("foxtrot");
		s.replaceAll( w -> w.toUpperCase() );
		System.out.println(s);

	}

}
