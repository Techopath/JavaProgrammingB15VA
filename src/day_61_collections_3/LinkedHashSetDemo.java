package day_61_collections_3;
import jdk.jshell.EvalException;

import java.util.LinkedHashSet;
import java.util.Set;

/*LinkedHashSet : keeps the order unlike to HashSet, (not sorting).
* does not allow duplication.
*
* set.forEach(each -> (-> this sign is lambda sign) System.out.println(each)); it is the other way for using for each loop, performs the same function*/
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("java");
        set.add("java");
        set.add("selenium");
        set.add("html");
        set.add("sql");
        set.add("git");
        set.add("ruby");

        System.out.println(set.size()); //the size is 6, because it does not allow duplicates.
        System.out.println(set.toString()); //keeping the order=> [java, selenium, html, sql, git, ruby]

        set.forEach(each -> /*lambda sign*/ System.out.println(each)); //it is the other way for using for each loop, performs the same function.
        set.forEach((String each) -> /*lambda sign*/ System.out.println(each)); //if we use data type we will need to take it inside a parenthesis.


        for (String each:set) {
            System.out.println(each);
        }

    }
}
