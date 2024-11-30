package cs1302.p2;

import cs1302.adt.FancyStringList;
import cs1302.oracle.FancyOracleStringList;

public class Driver{
    public static void main(String[] args) {
        FancyStringList s1, s2;

        s1 = new ArrayStringList();
        //s1 = new FancyOracleStringList();
        s1.append("a");
        s1.append("b");
        s1.append("c");
        s1.append("d");
        s1.append("e");
        s1.append("f");
        s1.append("g");

        s2 = new ArrayStringList();
        s2.append("1");
        s2.append("2");
        s2.append("3");
        s2.append("4");

        FancyStringList t1, t2;
        t1 = new FancyOracleStringList();
        t1.append("a");
        t1.append("b");
        t1.append("c");
        t1.append("d");
        t1.append("e");
        t1.append("f");
        t1.append("g");

        t2 = new FancyOracleStringList();
        t2.append("1");
        t2.append("2");
        t2.append("3");
        t2.append("4");

        s1.add(0, s2);
        t1.add(0, t2);
        System.out.println("Add test 1: " + s1.toString().equals(t1.toString()));
        s1.add(4, s1);
        t1.add(4, t1);
        System.out.println("Add test self ref: " + s1.toString().equals(t1.toString()));
        System.out.println("Sizes match: " + (t1.size() == s1.size()));

        s1.append(s2);
        t1.append(t2);
        System.out.println("append test 1: " + s1.toString().equals(t1.toString()));
        s1.append(s1);
        t1.append(t1);
        System.out.println("append test 2: " + s1.toString().equals(t1.toString()));
        System.out.println("Sizes match: " + (t1.size() == s1.size()));

        System.out.println("contains test 1: " + (s1.contains(0, "c") == t1.contains(0, "c")));
        System.out.println("contains test 2: " + (s1.contains(10, "c") == t1.contains(10, "c")));
        System.out.println("contains test 3: " + (s1.contains(-4, "c") == t1.contains(-4, "c")));
        System.out.println("contains test 4: " + (s1.contains(0, "z") == t1.contains(0, "z")));

        System.out.println("indexof test 1: " + (s1.indexOf(0, "c") == t1.indexOf(0, "c")));
        System.out.println("indexof test 2: " + (s1.indexOf(10, "c") == t1.indexOf(10, "c")));
        System.out.println("indexof test 3: " + (s1.indexOf(-4, "c") == t1.indexOf(-4, "c")));
        System.out.println("indexof test 4: " + (s1.indexOf(0, "z") == t1.indexOf(0, "z")));

        s1.prepend(s2);
        t1.prepend(t2);
        System.out.println("prepend test 1: " + s1.toString().equals(t1.toString()));
        s1.prepend(s1);
        t1.prepend(t1);
        System.out.println("prepend test 2: " + s1.toString().equals(t1.toString()));
        System.out.println("Sizes match: " + (t1.size() == s1.size()));

        t1.reverse();
        s1.reverse();
        System.out.println("REVERSE TEST: " + s1.toString().equals(t1.toString()));

        s1 = new ArrayStringList(s2);
        System.out.println(s1);
        System.out.println(s2);
        s1.append("a");
        System.out.println(s1);
        System.out.println(s2);

    }
}
