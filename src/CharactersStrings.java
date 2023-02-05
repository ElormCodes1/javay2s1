public class CharactersStrings {
    public static void main(String[] args) {
        //Escape Sequences Java \t, \n, \", \', \b
        System.out.println("Testing to \t see tab");
        System.out.println("Testing to \nsee newline");
        System.out.println("Testing to \"see double quotation\"");
        System.out.println("Testing to \'single quotation\'");

        //Casting characters as numbers and vice versa
        //find characters in numbers
        System.out.println("5256 represents character: "+(char)5356);
        System.out.println("5256 represents character: "+(char)525);
        System.out.println("5256 represents character: "+(char)2665);
        System.out.println("5256 represents character: "+(char)202);
        System.out.println("5256 represents character: "+(char)5356/*broken heart*/);

        //finding numbers represent characters
        System.out.println("? represents character: "+(int)'?');
        System.out.println("a represents character: "+(int)'a');
        System.out.println("A represents character: "+(int)'A');
        System.out.println("+ represents character: "+(int)'+');

        //Declaring character
        char letter = 'b';
        char num = '2';
        char letnum = 'm';
        System.out.println("Is " + letter + " a number? " + Character.isDigit(letter));
        System.out.println("Is " + letter + " a letter? " + Character.isLetter(letter));
        System.out.println("Is " + num + " a number? " + Character.isDigit(num));
        System.out.println("Is " + num + " a letter? " + Character.isLetter(num));
        System.out.println("Is " + num + " Upper Case? " + Character.isUpperCase(num));
        System.out.println("Is " + num + " lower Case? " + Character.isLowerCase(num));
        System.out.println("Is " + num + " Upper Case? " + Character.isUpperCase(letter));
        System.out.println("Is " + num + " lower Case? " + Character.isLowerCase(num));
        System.out.println("Is " + num + " to Upper Case? " + Character.toUpperCase(letnum));
        System.out.println("Is " + num + " to lower Case? " + Character.toLowerCase(letnum));

        //string data types
        String name = "Elorm Marrion";
        String hometown = "Tarkwa";
        //length of string
        System.out.println(name + " is of length " + name.length());
        System.out.println(name + " in Caps is " + name.toUpperCase()); // touppercase local . root
        System.out.println(name + " in lower case is " + name.toLowerCase());
        System.out.println("b"+name+"b" + " after trim b " + name.trim() + "b");
        System.out.println("Character at indes 2 in " + name + " is " + name.charAt(2));
        System.out.println(name.concat(hometown));

        //compring strings
        String firstname = "Elorm";
        String surnme = "MARRION";
        //comparing while taking note of the case
        System.out.println(firstname + " Equals the same as " + name + "? "+ firstname.equals(name));
        System.out.println(firstname + " Equals the same as " + name + "? "+ firstname.equalsIgnoreCase(name));
        System.out.println(name + " contains " + firstname+ "? "+ name.contains(firstname));
        System.out.println(hometown + " starts with " + "Tar? " + hometown.startsWith("Tar"));


    }
}
