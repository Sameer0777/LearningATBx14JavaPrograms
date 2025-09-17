package Ex_003_Literals;

public class Lab_032_Char_Literal {
    public static void main(String[] args) {

        char c1 = 'S'; // a-z A_Z !@#$%^(all special characters)
        char c2 = '@';
        char c3 = '?';
        char c4 = '/';
        char c5 = ';';
        char c6 = ' ';

        //Escape sequence
        char new_line = '\n';
        char tab = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Sameer Sharma");
        System.out.print("Sameer"+new_line+"Sharma\n");
        System.out.println("Sameer\nSharma");
        System.out.println("Sameer"+tab+"Sharma");
        System.out.println("Sameer"+back_space+" Sharma");
        System.out.println("-------------");

        System.out.println("This is 1st line"+new_line+"This is 2nd line\nThis is 3rd line");

        char a = 'A';
        //ASCII value is 65

        char rupee = '₹';
        System.out.println(rupee);

        char smily = '\u1f60';
        System.out.println(smily);
    }
}
