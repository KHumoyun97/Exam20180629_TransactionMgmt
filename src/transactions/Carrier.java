package transactions;

import com.sun.source.doctree.SeeTree;

import java.util.Set;
import java.util.TreeSet;

public class Carrier {
    private String name;
     private Set<Region> regions=new TreeSet<>();

    public Carrier(String name) {
        this.name = name;
    }

    public static void add(String carrierName) {
    }

    public String getName() {
        return name;
    }
}
