package day_17_while_do_while_loop;

public class FiveLittleMonkeys_Loop {
    public static void main(String[] args) {
        int monkeys = 5;
        while (monkeys >=1){
            if (monkeys == 1){

                System.out.println(monkeys +" little monkey jumping on the bed,");

            }else {
                System.out.println(monkeys +" little monkeys jumping on the bed,");

            }
            System.out.println("One fell down and bumped his head," +
                    "\nMama called the doctor and the doctor said, " +
                    "\nNo more monkeys jumping on the bed !");
            monkeys --;

            }

        System.out.println("Put those monkeys right to bed!");


    }

    }

