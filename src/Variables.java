public class Variables {
    // must be declared at class level
    enum gender {male,female};
    public static void main(String[] args) {
        //variable declaration (integers and float)
        int studentAge = 20;
        double hostelDistance = 2.3;
        float height;

        System.out.println(studentAge);
        height = 3;
        System.out.println(height);

        // string variables
        String studentName = "Gaius";
        String hostelName = "Camp city";
        String studentInfo = "Student of Umat";
        System.out.println(studentName + " : " + studentInfo);

        //constant variables
        final int studentYOB = 2002;

        //enumerated type
        gender student_gender = gender.male;
        System.out.println(studentName + " : " + student_gender);

        //assignment statements and expressions
        int currentAge = 2023 - studentYOB;
        System.out.println(currentAge);


    }
}
