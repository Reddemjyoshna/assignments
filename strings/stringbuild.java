class stringbuild {
    public static void main(String[] args) {
    	StringBuilder builder=new StringBuilder("StringBuilder ");
		builder.append("“is a peer class of String");
		System.out.println(builder);
		
		StringBuilder sb=new StringBuilder("insert text");
		sb.insert(10,"It is used to  at the specified index position at the location denoted by the sign");
		System.out.println(sb);
		
		StringBuilder revre=new StringBuilder("This method returns the reversed object on which it was");
		revre.reverse();
		System.out.println(revre);

        
    }
}
