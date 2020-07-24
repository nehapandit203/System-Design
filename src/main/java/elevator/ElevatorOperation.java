package elevator;

import db.FloorStateDB;

public class ElevatorOperation implements IElevator {


    public void startElevation(Elevator elevator) {
        Integer destination = null;

        while (!elevator.getRequests().isEmpty()) {
            destination = elevator.getRequests().peek();
            if (elevator.getCurrentFloor() < destination) //Move lift up
            {
                while (elevator.getCurrentFloor() != destination) {
                    moveUp(elevator);
                    checkCurrentFloorRequest(elevator);
                }
            }
            else if(elevator.getCurrentFloor() > destination){

                while (elevator.getCurrentFloor() != destination) {
                    moveDown(elevator);
                    checkCurrentFloorRequest(elevator);
                }
            }
            else {
                if(elevator.getCurrentFloor() == destination) {
                   checkCurrentFloorRequest(elevator);
                }
            }

            if(elevator.getRequests().isEmpty() && elevator.getCurrentFloor() != 0){
                addDestination(0,elevator);
                System.out.println("Returning Elevator To Rest Mode Currently At : "+elevator.getCurrentFloor());
            }else if(elevator.getRequests().isEmpty() && elevator.getCurrentFloor() == 0){

                System.out.println("Elevator is in Rest mode At Floor "+elevator.getCurrentFloor());
                elevator.setElevatorState(ElevatorState.IDLE);
                printStatus(elevator);
            }

        }

    }

    private void checkCurrentFloorRequest(Elevator elevator) {
        if(FloorStateDB.FLOORS_STATE_MAP.get(elevator.getCurrentFloor())==true){
             stop(elevator);
           if(!elevator.getRequests().contains(elevator.getCurrentFloor())){
               FloorStateDB.FLOORS_STATE_MAP.put(elevator.getCurrentFloor(),false);
           }
        }

    }


    public void moveUp(Elevator e) {
        int current_floor = e.getCurrentFloor();
        current_floor++;
        e.setElevatorState(ElevatorState.UP);
        e.setCurrentFloor(current_floor);
        printStatus(e);

    }

    public void moveDown(Elevator e) {
        int current_floor = e.getCurrentFloor();
        current_floor--;
        e.setElevatorState(ElevatorState.DOWN);
        e.setCurrentFloor(current_floor);
        printStatus(e);

    }

    public void addDestination(int floor,Elevator e) {
        FloorStateDB.FLOORS_STATE_MAP.put(floor,true);
        e.getRequests().add(floor);

    }

    public void stop(Elevator e) {
        e.setElevatorState(ElevatorState.STOP);
        e.getRequests().poll();
        printStatus(e);
    }

    public void printStatus(Elevator e) {
        System.out.println("Elevator:  Floor: " + e.getCurrentFloor() + " Elevator : State: " + e.getElevatorState());
    }

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
        //Case 4
        /*elevatorOperation.addDestination(1,elevator);*/

        //Case 4
        elevatorOperation.addDestination(1,elevator);
        elevatorOperation.addDestination(2,elevator);
        elevatorOperation.addDestination(1,elevator);
        elevatorOperation.startElevation(elevator);



    }

}
