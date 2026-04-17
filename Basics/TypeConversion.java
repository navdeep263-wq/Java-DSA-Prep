public class TypeConversion {
    public static void main(String[] args) {
        //typecasting or type conversion means converting one data type to another data type
        //implicit type conversion 
        int a = 10;
        double b = a;
        System.out.println(b);
        //another example of implicit type casting
        int num = 50;
        long bignum = num;
        System.out.println(bignum);

        //explicit type casting
        double x = 10.5;
        int y = (int) x;
        System.out.println(y);
        //another example of explicit type casting
        double price = 99.99;
        int newPrice = (int) price;
        System.out.println(newPrice);


    }
}
