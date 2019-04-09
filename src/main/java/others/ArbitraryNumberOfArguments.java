package others;

public class ArbitraryNumberOfArguments {
    public static void main(String[] args) {
        readName("Dan", "Ion", "George");
        System.out.println("************************************************************");
        readName("Danut");
        System.out.println("************************************************************");
        readName("Dan", "Ion", "George","Vasile","Marin","Gelu");
    }


    /*  Important Note: The argument(s) passed in this way is always an array - even if there's just one. Make sure you treat it that way in the method body.
        Important Note 2: The argument that gets the ... must be the last in the method signature. So, myMethod(int i, String... strings) is okay,
        but myMethod(String... strings, int i) is not okay.
       */
    public static void readName(String... name) {
        for (String s : name) {
            System.out.println(s);
        }
    }
}
