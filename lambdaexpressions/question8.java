import java.util.ArrayList;

public class question8 {

	public static void main(String[] args) {
		ArrayList<Integer> numlist = new ArrayList<>();
		numlist.add(1);
		numlist.add(2);
		numlist.add(3);
		numlist.add(4);
		numlist.add(5);
		numlist.add(6);
		Thread thread = new Thread(() -> numlist.forEach( num -> System.out.println(num)));
		System.out.println("list is: ");
		thread.run();	
		
	}

}
