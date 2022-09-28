package $_12_Interface;

public class $_132_interface {
    public static void main(String[] args) {

    }
}
/**
 * interface :
 * interface animal{
 *
 *     ----
 *     ----
 * } //this is a interface class
 *
 * all methods inside interface class is an abstract method,if we don't use abstract
 * keyword compiler will automatically cast it as abstract method.
 *
 * all instance variables are considered as a constant inside interface
 * public static final int num=30;
 *
 * a class can extends another class, an interface can extends another interface
 * but a class can't extends an interface, although it can implements,like:
 *
 * interface animal{
 *     ----
 *     void eat();
 *     ---
 * }
 * class Dog implements animal{
 * --------
 *      void eat(){
 *          System.out.println("dog can eat egg");
 *      }
 * ----
 * --
 * }
 * we cant create object of an interface or we can't instantiate
 * an interface.
 *
 */
