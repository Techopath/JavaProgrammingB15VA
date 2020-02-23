package day_60_collections2;
import java.util.*;
public class SortingAList {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("java"); list.add("js");list.add("html");list.add("ruby"); list.add("python");list.add("kotlin");
        list.add("A99");list.add("js");
        System.out.println("*********Before sorting");
        System.out.println(list.toString());
        Collections.sort(list);
        System.out.println("*****After sorting :");
        System.out.println(list.toString());
//--------------------------------------------------------------------------------
        List<Product> prodList = new ArrayList<>();
        prodList.add(new Product("rice", 10.2));
        prodList.add(new Product("laptop bag", 105.9));
        prodList.add(new Product("pc", 510));
        prodList.add(new Product("bmw 525i", 2.7));
        prodList.add(new Product("MacBook Pro", 1099.5));
        System.out.println("----Product list Before sorting --------");
        System.out.println(prodList.toString());

        System.out.println("----------- product list After sorting -----------");
        Collections.sort(prodList); //not reading until we go to Product class and implement Comparable
        System.out.println(prodList.toString());



    }
}
