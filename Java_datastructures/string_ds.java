public class string_ds {
    public static void main(String[] args){
        String s1 = "Ananth";
        s1+= "Kashyap "; //here a new s1 object is created as strings are immutable

        System.out.println(s1.charAt(0)); // Character at a certain index

        System.out.println(s1.substring(2,4)); //substring

        System.out.println(s1.indexOf("hya")); //prints index of first occurentce

        System.out.println(s1.lastIndexOf("an")); // prints last index of occurence

        System.out.println(s1.trim()); //removes starting and trailing space

        String s3="123";

        System.out.println(s3.length()); // prints length of the string

        s1.toCharArray(); //Convert to character array


    }
}
