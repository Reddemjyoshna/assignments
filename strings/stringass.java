class stringass {
    public static void main(String[] args) {
     String sr="hello world";
     System.out.println(sr.length());
     
     String s1="hello";
     String s2=" how r u";
     String s3=s1.concat(s2);
     System.out.println(s3);
     
     String st="Java String pool refers to collection of Strings which are stored in heap memory";
     System.out.println(st.toLowerCase());
     System.out.println(st.toUpperCase());
     System.out.println(st.replace('a','$'));
     System.out.println(st.contains("collection"));
     String str1="Java String pool refers to collection of Strings which are stored in heap memory";
     String str2="java string pool refers to collection of strings which are stored in heap memory";
     System.out.println(str1.equals(str2));
     System.out.println(str1.equalsIgnoreCase(str2));



    }
}