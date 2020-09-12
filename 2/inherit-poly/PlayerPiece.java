/**
 * <h1>Polymorphism<h1/>
 * <div style="font-size: 120%;">So now we have a PlayerPiece that passes the IS-A test for both the
 * GameShape class and the Animatable.java interface. That means a PlayerPiece can
 * be treated polymorphically as one of four things at any given time, depending on
 * the declared type of the reference variable:
 * <div/>
 * <div style="font-size: 105%;">
 *<ul><ul/>
 * <li>An Object (since any object inherits from Object )</li>
 * <li>A GameShape (since PlayerPiece extends GameShape )</li>
 * <li>A PlayerPiece (since that’s what it really is)</li>
 * <li>An Animatable.java (since PlayerPiece implements Animatable.java )</li>
 * <div/>
 */

public class PlayerPiece extends  GameShape implements Animatable{
    public void movePiece(){
        System.out.println("moving game piece");
    }

    public void animate(){
        System.out.println("animating ...");
    }

}