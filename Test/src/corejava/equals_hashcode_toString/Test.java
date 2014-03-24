package corejava.equals_hashcode_toString;

public class Test {

    public static void main(final String[] args) {
        final Person person = new Person("Gandhi", 188598);
        System.out.println(person);
        
        System.out.println(person.equals(null));;
        
        System.out.println(new Person1(1, "Gandhi", "Hyd", 20000f));
    }
}
