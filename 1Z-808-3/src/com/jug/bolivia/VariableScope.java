package com.jug.bolivia;

public class VariableScope {
    static int s = 47;      // static variable
    int x;                  // instance variable
    { x = 7; int x2 = 5; }  // initialization block
    VariableScope(){ x +=8; int x3 = 6;} // constructor

    void doStuff(){
        int y = 0;          // local variable
        for (int z = 0; z < 4; z++){   // for, code block
            y += z + x;
        }
    }
}


/*
    s is a static variable.   
    x is an instance variable.   
    y is a local variable (sometimes called a “method local” variable).   
    z is a block variable.   
    x2 is an init block variable, a flavor of local variable.   
    x3 is a constructor variable, a flavor of local variable.

 */