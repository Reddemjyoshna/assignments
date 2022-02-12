class stringbuff {
    public static void main(String[] args) {
    	StringBuffer buffer=new StringBuffer("StringBuffer ");
		buffer.append("“is a peer class of String");
		System.out.println(buffer);
		
		StringBuffer sb=new StringBuffer("insert text");
		sb.insert(10,"It is used to  at the specified index position at the location denoted by the sign");
		System.out.println(sb);
		
		StringBuffer revre=new StringBuffer("This method returns the reversed object on which it was");
		revre.reverse();
		System.out.println(revre);

        
    }
}
