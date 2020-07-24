package elevator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElevatorOperationTest {

    //have to assert
    @Test
    void startElevation1() {
        Elevator elevator = new Elevator();
        ElevatorOperation elevatorOperation = new ElevatorOperation(); //Implement Runnable
        //Case-1
        elevatorOperation.addDestination(2,elevator);
        elevatorOperation.addDestination(3,elevator);
        elevatorOperation.startElevation(elevator);
    }

    @Test
    void startElevation2() {
        Elevator elevator = new Elevator();
        ElevatorOperation elevatorOperation = new ElevatorOperation(); //Implement Runnable
        //Case-2
        elevator.setCurrentFloor(3);
        elevatorOperation.addDestination(1,elevator);
        elevatorOperation.startElevation(elevator);
    }

    @Test
    void startElevation3() {
        Elevator elevator = new Elevator();
        ElevatorOperation elevatorOperation = new ElevatorOperation(); //Implement Runnable
        //Case-1
        elevator.setCurrentFloor(1);
        elevatorOperation.addDestination(1,elevator);
        elevatorOperation.startElevation(elevator);
    }

    @Test
    void startElevation4() {
        Elevator elevator = new Elevator();
        ElevatorOperation elevatorOperation = new ElevatorOperation(); //Implement Runnable
        //Case-3
        elevatorOperation.addDestination(2,elevator);
        elevatorOperation.addDestination(3,elevator);
        elevatorOperation.startElevation(elevator);
    }

    @Test
    void startElevation5() {
        Elevator elevator = new Elevator();
        ElevatorOperation elevatorOperation = new ElevatorOperation(); //Implement Runnable
        //Case-4
        elevatorOperation.addDestination(1,elevator);
        elevatorOperation.addDestination(3,elevator);
        elevatorOperation.addDestination(1,elevator);
        elevatorOperation.addDestination(5,elevator);
        elevatorOperation.addDestination(10,elevator);
        elevatorOperation.addDestination(2,elevator);
        elevatorOperation.startElevation(elevator);
    }

    @Test
    void startElevation6() {
        Elevator elevator = new Elevator();
        ElevatorOperation elevatorOperation = new ElevatorOperation(); //Implement Runnable
        //Case-5
        elevatorOperation.addDestination(1,elevator);
        elevatorOperation.startElevation(elevator);
    }

    @Test
    void startElevation7() {
        Elevator elevator = new Elevator();
        ElevatorOperation elevatorOperation = new ElevatorOperation(); //Implement Runnable
        //Case-6
        elevatorOperation.addDestination(1,elevator);
        elevatorOperation.addDestination(2,elevator);
        elevatorOperation.addDestination(1,elevator);
        elevatorOperation.startElevation(elevator);
    }
}