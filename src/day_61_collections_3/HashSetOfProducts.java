package day_61_collections_3;
import java.util.*;
import day_60_collections2.*;

public class HashSetOfProducts {
    public static void main(String[] args) {
        Set<Product> prodSet = new HashSet<>();
        prodSet.add(new Product("book", 25));
        prodSet.add(new Product("book", 25));
        prodSet.add(new Product("magazine", 1.2));

        System.out.println(prodSet.size());
        System.out.println(prodSet.toString()); /*if we don't teach the code to differentiate the duplicates, it prints out all the duplicates.
        we go to Product class and generate equals() and HashCode
        () ...then the print out prints out only the unique values. */
    }
}
