package corejava.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import corejava.string.PossibleStrings;

/**
 * Calss to print the list of methods available in a class using reflection
 * mechanism
 * 
 * @author pullalarevug
 * 
 */
public class AllMethodsTest {

    public static void main(final String[] args) throws IllegalArgumentException, IllegalAccessException,
            InvocationTargetException {
        List<String> strList = new ArrayList<String>();
        final Method[] methods = PossibleStrings.class.getMethods();
        for (final Method method : methods) {
            System.out.println(Modifier.toString(method.getModifiers()) + " " + method.getName());
            if (method.getName().equalsIgnoreCase("reverseTwoLengthString")) {
                strList = (List<String>) method.invoke("AB");
            }
        }

        for (final String element : strList) {
            System.out.println(element);
        }
    }

}
