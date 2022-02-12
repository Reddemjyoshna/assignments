interface arthmatics
{
	int calci(int a,int b);
}
class calci
{
	public static void main(String[] args) {
		arthmatics add=(a,b)->(a+b);
		System.out.println("the addtion is :"+add.calci(10,20));
		arthmatics sub=(a,b)->(a-b);
		System.out.println("subtraction is :"+sub.calci(10,20));
		arthmatics mul=(a,b)->(a*b);
		System.out.println("multiplication is :"+mul.calci(10,20));
		arthmatics div=(a,b)->(a+b);
		System.out.println("division is :"+div.calci(10,20));
		
	}
}