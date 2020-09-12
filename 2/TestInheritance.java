/**
 * <h1>Inheritance</h1>
*<div style="font-size: 120%;">Inheritance is everywhere in Java. It’s safe to say that it’s almost (almost?) impossible to write even the tiniest Java program without using inheritance.</div>
*/
public class TestInheritance {
    public static void main(String... jug) {
        TestInheritance t1 = new TestInheritance();
        TestInheritance t2 = new TestInheritance();
        if(!t1.equals(t2)){
            System.out.println("The are not equal");
        }
        if(t1 instanceof Object){
            System.out.println("t1 is an Object");
        }
    }
}

