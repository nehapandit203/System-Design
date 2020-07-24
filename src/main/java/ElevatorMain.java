import elevator.Elevator;
import elevator.ElevatorOperation;

public class ElevatorMain {

    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        ElevatorOperation elevatorOperation = new ElevatorOperation(); //Implement Runnable
        //Case-1
       /* elevatorOperation.addDestination(2,elevator);
        elevatorOperation.addDestination(3,elevator);*/

        //Case 2
       /* elevator.setCurrentFloor(3);
        elevatorOperation.addDestination(1,elevator);*/

        //Case 3
       /* elevator.setCurrentFloor(1);
        elevatorOperation.addDestination(1,elevator);*/

        //Case 4
       /* elevatorOperation.addDestination(1,elevator);
        elevatorOperation.addDestination(3,elevator);
        elevatorOperation.addDestination(1,elevator);
        elevatorOperation.addDestination(5,elevator);
        elevatorOperation.addDestination(10,elevator);
        elevatorOperation.addDestination(2,elevator);*/

       //Case 5
        /*elevatorOperation.addDestination(1,elevator);*/

        //Case 6
        elevatorOperation.addDestination(1,elevator);
        elevatorOperation.addDestination(2,elevator);
        elevatorOperation.addDestination(1,elevator);
        elevatorOperation.startElevation(elevator);


    }

}
