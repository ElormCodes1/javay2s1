public class EqualityandRelationalOperators {
    public static void main(String[] args) {
        int A = 24;
        int B = 30;
        //equality operators
        System.out.print("Is the number (" + A + ") equal to (" + B + "): ");
        System.out.println(A == B);
        System.out.print("Is the number (" + A + ") not equal to (" + B + "): ");
        System.out.println(A != B);

        //relational operators
        System.out.print("Is the number (" + A + ") greater than (" + B + "): ");
        System.out.println(A > B);
        System.out.print("Is the number (" + A + ") less than (" + B + "): ");
        System.out.println(A < B);
        System.out.print("Is the number (" + A + ") greater than or equal to (" + B + "): ");
        System.out.println(A >= B);
        System.out.print("Is the number (" + A + ") less than or equal to (" + B + "): ");
        System.out.println(A <= B);

        //ternary operator
        int x = (A == B) ? 45 : 80;
        System.out.println(x);



    }
}
