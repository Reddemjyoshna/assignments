import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class question5 {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("alpha");
		s.add("bravo");
		s.add("charlie");
		s.add("delta");
		s.add("echo");
		s.add("foxtrot");
		StringBuilder str = new StringBuilder("");
		Consumer<String> consumer = j-> str.append(j.charAt(0));
		s.forEach(w -> consumer.accept(w));
		System.out.println("Final String is: " + str);
	}

}
