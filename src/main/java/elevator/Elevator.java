package elevator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Elevator {
    private Integer currentFloor;
    private ElevatorState elevatorState;
    private List<Integer> requests;
    //Integer destinationFloor;


    public Elevator() {
        this.currentFloor = ElevatorConstants.FloorConstant.MIN;
        this.elevatorState = ElevatorState.IDLE;
        this.requests =  new ArrayList<Integer>();
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

    public List<Integer> getRequests() {
        return requests;
    }

    public void setRequests(List<Integer> requests) {
        this.requests = requests;
    }
}
