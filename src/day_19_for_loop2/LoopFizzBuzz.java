package day_19_for_loop2;
/*
create a class loopFizzBuzz
for loop from 0 to 100
if loop variable is divisible by 3 and 5
print " 15 is FizzBuzz Number";
if loop variable is divisible by 3
print "6 is Fizz number";
if loop variable is divisible by 5
print "10 is Buzz number";
 */
public class LoopFizzBuzz {
    public static void main(String[] args) {
        for (int n=0; n<=100; n++){
            int a=3;


            if (n %5 ==0 && n%3 ==0){

                System.out.println(n +" is FizzBuzz number. So it is divisible both by 3 and 5");
            }else if (n%5 ==0){
                System.out.println(n + " is Buzz number. it is divisible only by 5");
            }else if (n%a==0){
                System.out.println(n + " is Fizz number. it is divisible by "+a);
            }
        }
    }

}
