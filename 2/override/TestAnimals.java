/**
 * <h1>Override</h1>
 * <div style="font-size: 110%;">
 *     <ul>
 *         <li>The argument list must exactly match that of the overridden method. If
 * they don’t match, you can end up with an overloaded method you didn’t
 * intend.</li>
 *         <li>The return type must be the same as, or a subtype of, the return type
 * declared in the original overridden method in the superclass. (More on
 * this in a few pages when we discuss covariant returns.)</li>
 *         <li>The access level can’t be more restrictive than that of the overridden
 * method.</li>
 *         <li>The access level CAN be less restrictive than that of the overridden
 * method.</li>
 *         <li>Instance methods can be overridden only if they are inherited by the
 * subtype. A subtype within the same package as the instance’s supertype
 * can override any supertype method that is not marked private or final .
 * A subtype in a different package can override only those non final
 * methods marked public or protected (since protected methods are
 * inherited by the subtype).</li>
 *         <li>The overriding method CAN throw any unchecked (runtime) exception,
 * regardless of whether the overridden method declares the exception.</li>
 *         <li>The overriding method must NOT throw checked exceptions that are new
 * or broader than those declared by the overridden method. For example, a
 * method that declares a FileNotFoundException cannot be overridden by
 * a method that declares a SQLException , Exception , or any other non-
 * runtime exception unless it’s a subclass of FileNotFoundException .</li>
 *         <li>The overriding method can throw narrower or fewer exceptions. Just
 * because an overridden method “takes risks” doesn’t mean that theoverriding subtype’s exception takes the same risks. Bottom line: an
 * overriding method doesn’t have to declare any exceptions that it will
 * never throw, regardless of what the overridden method declares.</li>
 *         <li>You cannot override a method marked final .</li>
 *         <li>You cannot override a method marked static . We’ll look at an example
 * in a few pages when we discuss static methods in more detail.</li>
 *         <li>If a method can’t be inherited, you cannot override it. Remember that
 * overriding implies that you’re reimplementing a method you inherited!
 * For example, the following code is not legal, and even if you added an
 * eat() method to Horse , it wouldn’t be an override of Animal ’s eat()
 * method.</li> *
 *     </ul>
 * </div>
 *
 * <img src="../images/ilegal.png"/>
 */
public class TestAnimals{
    public void eat(){
        System.out.println("Generic Animal Eating Generically");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse(); // Animal ref, but a Horse object
        a.eat();  // Runs the Animal version of eat()
        b.eat();  // Runs the Horse version of eat()

        //b.buck(); // Animal class doesn't have that method

        b.print();
    }
}