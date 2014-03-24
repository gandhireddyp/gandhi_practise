package corejava.collections.generics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class GenericsTest {

    public static void main(final String[] args) {

        // Raw collections accepts any kind of set
        Set rawSet = new HashSet<String>();
        rawSet = new HashSet<Integer>();

        // Set<?> represents SetOfUnknownType and you can assign SetOfString or
        // SetOfInteger to Set<?>
        Set setOfUnknownType = new LinkedHashSet<String>();
        setOfUnknownType = new LinkedHashSet<Integer>();

        // Parametrized Type also follow Inheritance at main Type level means
        // both HashSet<String> and LinkedHashSet<String> are sub types of
        // Set<String> and legal by compiler
        Set<String> setOfString = new HashSet<String>(); // valid in Generics
        setOfString = new LinkedHashSet<String>();

        // Inheritance on type parameter is not supported means Set<Object> will
        // not accept Set<String>
        // TODO - comment below line for compile time error
        // final Set<Object> SetOfObject = new HashSet<String>();

        // You can not use Generics in .class token, parametrized types like
        // List<String> are not allow along with .class literal.
        final Class c = List.class; // legal
        // Illegal. TODO - comment below line for compile time error
        // final Class c1 = List<String>.class;

        System.out.println(identical("ABC"));

    }

    // If you are writing Generics method than you need to declare type
    // parameters in method signature between method modifiers and return type
    public static <T> T identical(final T source) {
        return source;
    }

}
