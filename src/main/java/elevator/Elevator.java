package elevator;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator {
    private Integer currentFloor;
    private ElevatorState elevatorState;
    private Queue<Integer> requests;
    //Integer destinationFloor;


    public Elevator() {
        this.currentFloor = ElevatorConstants.FloorConstant.MIN;
        this.elevatorState = ElevatorState.IDLE;
        this.requests = new LinkedList<Integer>();
    }

    public Integer getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(Integer currentFloor) {
        this.currentFloor = currentFloor;
    }

    public ElevatorState getElevatorState() {
        return elevatorState;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    public Queue<Integer> getRequests() {
        return requests;
    }

    public void setRequests(Queue<Integer> requests) {
        this.requests = requests;
    }
}
