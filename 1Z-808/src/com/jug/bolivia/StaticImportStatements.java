package com.jug.bolivia;

//Even though the feature is commonly called “static import,”
// the syntax MUST be import static followed by the fully qualified name of the static member you want to import,
// or a wildcard
import static java.lang.System.out;
import static java.lang.Integer.*;

public class StaticImportStatements {
    static public void main(String... args) {
        out.println(MAX_VALUE);
        out.println(toHexString(47));

    }
}
