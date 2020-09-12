/**
 *<H1>Encapsulation</H1>
 * <div style="font-size: 120%;">
 *      The ability to make changes in your implementation code without breaking the code of others who use your code is a key benefit of encapsulation.
 * <div/>
 * <div style="font-size: 100%;" >
 *     <ul>
 *          <li>Keep instance variables hidden (with an access modifier, often private).</li>
 *          <li>Make public accessor methods, and force calling code to use those methods rather than directly accessing the instance variable.
 *          These so-called accessor methods allow users of your class to set a variable’s value or get a variable’s value. </li>
 *          <li>For these accessor methods, use the most common naming convention of set.</li>
 *      <ul/>
 *  <div/>
 */
public class BadOO{

    public int left;
    public int right;

    public void setLeft(int left){
        this.left = left;
        this.right = left * 2;
    }
}