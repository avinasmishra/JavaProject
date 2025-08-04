package Y2025.Java8Feature;
@FunctionalInterface //its optional
interface Greeting
{
    public void sayHello();
}
public class LamdaExpression {
    public static void main(String[] args) {

        Greeting greeting = ()-> System.out.println("Hi");
        greeting.sayHello();

    }
}
