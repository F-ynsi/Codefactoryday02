package CF.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String hannah = "Did Hannah see bees? Hannah did";

        System.out.println(hannah.length());

        System.out.println(hannah.charAt(12));

        System.out.println(hannah.charAt(15));

        String myStr = "Java is great!";
        System.out.println("Original String = " + myStr);
        char character1 = myStr.charAt(1);
        char character2 = myStr.charAt(3);
        System.out.println("character at position 1 is " + character1);;
        System.out.println("character at position 3 is " + character2);;

        String carOrCat = "Was it a car or a cat I saw?".substring(9,12);
        System.out.println(carOrCat);
        System.out.println(carOrCat.length());


        ////
        ///Intermediate (Strings)
        ///A3
        ///1)

        String myName = "  Farzaneh ";
        System.out.println(myName.indexOf("r"));
        System.out.println(myName.startsWith("z"));
        System.out.println(myName.compareTo("name"));
        System.out.println(myName);
        System.out.println(myName.trim());
        System.out.println(myName.replace('a' , 'f'));
        System.out.println(myName.replaceAll("neh" , " "));
        System.out.println(myName.split("a"));//// This is incorrect


        ///2)
        String Jj = "java is juicy";
        System.out.println(Jj.contains("is"));


        ///3)
        String myCoding = "Coding is fun";
        System.out.println(myCoding.endsWith("un"));
        String myCoding01 = "Coding is fnu";
        System.out.println(myCoding01.endsWith("un"));

        ///Advanced (Strings)
        ///A4

        String myFullName = "Amin Hosseini";
        System.out.print(myFullName.charAt(0));
        System.out.println(myFullName.charAt(9));

        ///Basic (Methods)










    }
}
