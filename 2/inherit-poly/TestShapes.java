public class TestShapes{
    public static void doShapes(   GameShape shape   ){
        shape.displayShape();
    }

    public static void main(String[] args) {
        /*
        The key point is that the doShapes() method is declared with a GameShape
        argument but can be passed any subtype (in this example, a subclass) of
        GameShape . */

        PlayerPiece player1 = new PlayerPiece();
        TilePiece tile1 = new TilePiece();
        doShapes(player1);
        doShapes(tile1);


        /*
        There’s only one object here—an instance of type PlayerPiece —but there
        are four different types of reference variables.

        Remember that method invocations allowed by the compiler are based solely
        on the declared type of the reference, regardless of the object type.

        Which of the preceding reference variables can invoke the displayShape() method?

        Which methods can be invoked when the PlayerPiece object is being referred to using a reference declared as type Animatable.java ?
        */
        PlayerPiece player = new PlayerPiece(); //1
        Object o = player;
        GameShape shape = player;// 1
        Animatable mover = player; // 2

        //o.displayShape();
        //mover.displayShape();

        player.displayShape();
        shape.displayShape();

        mover.animate();
    }

}