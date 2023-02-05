public class MathFunctions {
    public static void main(String[] args) {
        //math constants in java PI and E
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(2*Math.PI*4.5);

        //trigonometric functions
        System.out.println("TRIG FUNCTIONS IN JAVA");
        System.out.println(Math.sin(90)); //actual sine of 90 won't be produced
        //sin cos and tan takes value in radians
        System.out.println(Math.cos(Math.toRadians(90)));
        System.out.println(Math.tan(Math.toRadians(90)));//actual sine of 90 won't be produced
        System.out.println(Math.cos(Math.toRadians(90)));

        //ASSIGNMENT TEST ASIN, ACOS, ATAN

        //exponent functions
        System.out.println(Math.exp(5));// constant E to the power 5
        System.out.println(Math.log(20));// natural log of 20
        System.out.println(Math.log10(20));// log with base 10 of 20
        System.out.println(Math.pow(5,7));// 5 raise to the power 7
        System.out.println(Math.sqrt(25));// square root of 25
        System.out.println(Math.pow(125,(1.0/6))); //125 to the 1/6th root

        //rounding methods in java
        System.out.println("Rounding Methods in Java");
        System.out.println("round: " + Math.round(89.7952));
        System.out.println("round: " + Math.round(89.1952));
        System.out.println("ceil: " + Math.ceil(89.7952));
        System.out.println("ceil: " + Math.ceil(89.1952));
        System.out.println("floor: " + Math.floor(89.7952));
        System.out.println("floor: " + Math.floor(89.1952));
        System.out.println("rint: " + Math.rint(89.7952));
        System.out.println("rint: " + Math.floor(89.1952));

        System.out.println(Math.round((1.0/3) * 1000.0) / 1000.0);

        //min max absolute functions
        System.out.println(Math.max(4,5));
        System.out.println(Math.min(4,5));
        System.out.println(Math.abs(-5.0));

        //random number generator
        double randomNumber = Math.random();
        System.out.println(randomNumber);
        System.out.println(randomNumber*5);
        System.out.println((int)(randomNumber*5));



    }
}
