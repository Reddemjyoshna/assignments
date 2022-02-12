import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;


public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> words = new HashMap<Integer, String>();
		words.put(1, "alpha");
		words.put(2, "bravo");
		words.put(3, "charlie");
		words.put(4, "delta");
		words.put(5, "echo");
		words.put(6, "foxtrot");
		
		StringBuilder str = new StringBuilder();
		BiConsumer<Integer,String> consumer = (key, value) -> str.append(key + value);

		words.entrySet().forEach(e -> consumer.accept(e.getKey(), e.getValue()));
		
		System.out.println("Final string : " + str);	

	}

}

