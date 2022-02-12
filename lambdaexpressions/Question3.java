import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question3 {

	public static void main(String[] args) {


			Predicate<String> predicate = s -> s.length()==7;
			Supplier<String> supplier = () -> "jyoshna";
			Consumer<String> consumer= s -> System.out.println("String is: " + s);
			Function<String,Integer> function = s -> s.length();
		
			System.out.println(predicate.test("hii"));
			System.out.println(supplier.get());
			consumer.accept("jyoshna");
			System.out.println(function.apply("jyoshna"));

	}

}
