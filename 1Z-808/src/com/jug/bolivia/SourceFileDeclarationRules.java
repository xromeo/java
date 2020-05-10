// Comments can appear at the beginning or end of any line in the source code file;
// they are independent of any of the positioning rules discussed here.

//If the class is part of a package, the package statement must be the first line in the source code file
package com.jug.bolivia;

//If there are import statements, they must go between the package statement (if there is one) and the class declaration.
// If there isn’t a package statement, then the import statement(s) must be the first line(s) in the source code file.
// If there are no package or import statements, the class declaration must be the first line in the source code file.
import java.util.ArrayList;
import java.util.List;

// The name of the file must match with the file with the public class name
public class SourceFileDeclarationRules {
    public void rules(){
        List<String>  stringList = new ArrayList<>();
    }
}

// A file can have more than one non-public class.
//
// Files with no public classes can have a name that does not match any of the classes in the file.
class OnePublicClassPerFile {
    public void rules(){
        // import and package statements apply to all classes within a source code file.
        // In other words, there’s no way to declare multiple classes in a file and have them in different packages or use different imports.
        List<String>  stringList = new ArrayList<>();
    }
}
// Source file declaration rules - end