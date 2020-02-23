package day_41_encapsulation;

/*
currentFloor
G-floor, 1,2,3,4,5,6

method: goToFloor(newFloor)

test if within range
currentFloor -> 2
you want to go to floor 5 - > newFloor -5
going up to floor 3
going up to floor 4
going up to floor 5

currentFloor -> 3
you want to go to floor 0 - > newFloor -0
going up to floor 2
going up to floor 1
going up to floor 0

currentFloor -3
newFloor -3
you are already on floor 3

 */
public class Elevator {
    int currentFloor;

    public void goToFloor(int newFloor){
        //check if new floor is out of range if yes exit method
        if (newFloor<0 || newFloor>6 ){
            System.out.println("Error: No floor number "+newFloor +" in this building");
            return;
        }
        if(newFloor >currentFloor){
            for (int i = currentFloor+1; i <= newFloor; i++) {

                System.out.println("going up : "+i);
            }
            currentFloor = newFloor;
        }

        else if(newFloor<currentFloor){
            for (int i = currentFloor-1; i >= newFloor; i--) {
                System.out.println("going down: "+i);
            }
        }

//        while(currentFloor !=newFloor){
//            if (newFloor>currentFloor){
//                currentFloor ++;
//                System.out.println("goes up: "+currentFloor);
//            }else{
//                currentFloor --;
//                System.out.println(" goes down: "+currentFloor);
//            }
//        }

    }

}
