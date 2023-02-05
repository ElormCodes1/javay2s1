public class NumericTypeCasting {
    public static void main(String[] args) {
        //numeric data type
        int Age = 18;
        double Height = 1.82;
        String weight = "78.19";
        String weight2 = "73";
        //conversions
        double newAge = Age;
        int newHeight = (int)Height;
        double newWeight = Double.parseDouble(weight);
        int weightint = Integer.parseInt(weight2);
        System.out.println(newAge +" as a double from an int");
        System.out.println(newHeight +" as a int from an double");
        System.out.println(newWeight +" as a decimal from an string");
        System.out.println(weight2 +" as a int from an string");
    }
}
