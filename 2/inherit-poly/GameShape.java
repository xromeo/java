/**
 * <h1>Polymorphism<h1/>
 * <div style="font-size: 120%;">Polymorphism is the ability of a single interface to support multiple underlying forms.<div/>
 * <div style="font-size: 100%;">
 *     <ul>
 *         <li>A reference variable can be of only one type, and once declared, that type
 * can never be changed (although the object it references can change).</li>
 *         <li>A reference is a variable, so it can be reassigned to other objects (unless
 * the reference is declared final ).</li>
 *         <li>A reference variable’s type determines the methods that can be invoked
 * on the object the variable is referencing.</li>
 *         <li>A reference variable can refer to any object of the same type as the
 * declared reference, or—this is the big one—it can refer to any subtype
 * of the declared type!</li>
 *         <li>A reference variable can be declared as a class type or an interface type.
 * If the variable is declared as an interface type, it can reference any object
 * of any class that implements the interface.</li>
 *     </ul>
 *
 *     <div/>
 */

public class GameShape{
    public void displayShape(){
        System.out.println("displaying shape");
    }

}