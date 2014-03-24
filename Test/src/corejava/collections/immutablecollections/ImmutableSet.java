package corejava.collections.immutablecollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSet {

    public static final Set<String> FTTC_VALID_REASONCODE = new HashSet<String>(Arrays.asList("C", "E", "T", "Z", "A",
            "B", "G", "L", "N", "R"));

    public static void main(final String[] args) {

        System.out.println(FTTC_VALID_REASONCODE.size());

        // Now C2 is an immutable set
        final Set<String> c2 = Collections.unmodifiableSet(FTTC_VALID_REASONCODE);

        c2.add("D");

        System.out.println(FTTC_VALID_REASONCODE.size());
    }

}
