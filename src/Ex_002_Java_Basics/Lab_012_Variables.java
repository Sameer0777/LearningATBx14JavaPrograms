package Ex_002_Java_Basics;

public class Lab_012_Variables {
    public static void main(String[] args) {

        /*
        * data_type variable_name = variable_value;
        * */

        byte age = 24;
        //short age = 24; // we use short if value exceeds 127, because byte can store upto 127 bits

        /*
        * byte -> datatype
        * age -> variable name
        * = -> Assignment operator
        * 24 -> variable value | Literal
        * */

        age = 25;
        age = 24;
        System.out.println(age);
    }
}
