package day_60_collections2;

import java.util.Objects;

public class Product implements Comparable<Product>{

    //If we want to compare custom class objects, we need to implement Comparable interface.

 /*we generated equals () and HashCode() in order to print out unique elements in HashSetOfProducts class. */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    private String name;
    private double price;

    /*this method return an int of 3 types:

     * 1. positive number -> this Product is larger than anotherProduct
     * 2. zero -> this product and anotherProduct are equal
     * 3. negative -> this product is smaller than another Product
     *
     * */
    @Override
    public int compareTo(Product anotherProduct) {
        //sorting according to product name
        return this.name.compareTo(anotherProduct.name);

        // sorting according to product price
//        if(this.price > anotherProduct.price){
//            return 1;
//        }else if(this.price == anotherProduct.price){
//            return 0;
//        }
//        else{
//            return -1;
//        }

    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
