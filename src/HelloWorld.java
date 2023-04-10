public class HelloWorld {

    public static void main(String[] args){
        int myFavoriteNumber = 4;
        String myString = "Hello";
        long myNumber = 123;

        System.out.println("Hello, World!");

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;

        int x = 4;
        x += 5;

        int x = 3;
        int y = 4;
        y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
    }
}
