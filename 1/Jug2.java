class Jug2{
    // legal constructors
    Jug2() {}
    private Jug2 (byte b) { }
    Jug2 (int x) {}
    Jug2 (int x, int... y) { }
    // ilegal constructors
    void Jug2() { }             // it is a method not a constructor
    Jug() { }                   // Not a method or a constructor
    Jug2(short s);              // looks like an abstract method
    static Jug2(float f) { }    // can't be static
    final Jug2(long x) { }      // can't be final
    abstract Jug2(char c) { }   // can't be abstract
    Jug2(int... x, int t) { }   // bad var-arg syntax

}