package replitExamples;
import java.util.*;
public class Carpet {
    //do not change -- Start
    public double width, length, unitPrice, totalPrice;
    public boolean isPersian;
    //do not change -- End

    //Add constructors below

    public Carpet() {
width = 300;
length =300;
unitPrice =0;
isPersian =false;
        totalPrice = 200;

    }


    public Carpet(double width, double length, double unitPrice, boolean isPersion) {

                this.width = width;
                this.length = length;
                this.unitPrice = unitPrice;
                this.isPersian = isPersion;

             //   setTotalPrice();
        if(isPersian == false){
            totalPrice = (width+length)*unitPrice;
        }else{
            totalPrice = (width+length)*unitPrice+200.0;
        }

    }



}
