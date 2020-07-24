/*
package elevator;

import db.LiftSPositionDB;

import java.util.LinkedList;
import java.util.Queue;

public class ElevatorService implements Elevator, ElevatorConstants {

    public static Queue<FLoorButton> requestQueue = new LinkedList<FLoorButton>();

    LiftStatus liftStatus = new LiftStatus().getLiftStatus();

    public void open() {
        System.out.println("Door Opens");
    }

    public void close() {
        System.out.println("Door Close");
    }

    public void moveUp() {
        System.out.println("Moving Up");
    }

    public void moveDown() {
        System.out.println("Moving Down");
    }

    public void getLiftService(int userLocation) {

        if (LiftSPositionDB.LIFT_CURRENT_POSITION.get(ElevatorConstants.LIFT_AVAILABLE)) {

            try {
                if (userLocation == liftStatus.getCurrentFloor()) {
                    open();
                    requestQueue.add(new FLoorButton(3));
                    if (requestQueue.isEmpty()) {//Check No Floor button request made
                        Thread.sleep(1000);
                        close();
                    } else {
                        Thread.sleep(1000);
                        close();

                      */
/*  requestQueue.add(new FLoorButton(3));
                        requestQueue.add(new FLoorButton(5));
                        requestQueue.add(new FLoorButton(2));
                        requestQueue.add(new FLoorButton(4));*//*


                        LiftSPositionDB.LIFT_CURRENT_POSITION.put(ElevatorStateConstant.LIFT_AVAILABLE, false);
                        ElevatorConstants

                    }
                } else if (userLocation > liftStatus.currentFloor) {
                    moveUp();
                    open();

                    if (requestQueue.isEmpty()) {//Check No Floor button request made
                        Thread.sleep(2000);
                        close();
                    } else {
                        Thread.sleep(2000);
                        close();
                        LiftSPositionDB.LIFT_CURRENT_POSITION.put(ElevatorConstants.LIFT_AVAILABLE, false);
                        processAllFloorRequest(requestQueue, liftStatus);

                    }
                } else if (userLocation < liftStatus.currentFloor) {
                    moveDown();
                    open();

                    if (requestQueue.isEmpty()) {//Check No Floor button request made
                        Thread.sleep(2000);
                        close();
                    } else {
                        Thread.sleep(2000);
                        close();
                        LiftSPositionDB.LIFT_CURRENT_POSITION.put(ElevatorConstants.LIFT_AVAILABLE, false);
                        processAllFloorRequest(requestQueue, liftStatus);

                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } else {
            //Keep Moving Lift -Waiting for lift to be available
        }

    }

    private void processAllFloorRequest(Queue<FLoorButton> requestingFloor, LiftStatus liftStatus) {
        if (!requestQueue.isEmpty()) {
            for (FLoorButton requestFloor : requestQueue) {
                if (requestFloor.getFloor() == liftStatus.getCurrentFloor()) {
                    liftStatus.setDestinationFloor(requestFloor.getFloor());
                    open();
                    liftStatus.setCurrentFloor(requestFloor.getFloor());
                    System.out.println(liftStatus);
                    // liftStatus.setDirection(LiftPosition.REST);

                } else if (requestFloor.getFloor() > liftStatus.getCurrentFloor()) {
                    moveUp();
                    open();
                    liftStatus.setDestinationFloor(requestFloor.getFloor());
                    liftStatus.setCurrentFloor(requestFloor.getFloor());
                    //liftStatus.setDirection(LiftPosition.REST);
                    System.out.println(liftStatus);


                } else if (requestFloor.getFloor() < liftStatus.getCurrentFloor()) {
                    moveDown();
                    open();
                    liftStatus.setDestinationFloor(requestFloor.getFloor());
                    liftStatus.setCurrentFloor(requestFloor.getFloor());
                    //liftStatus.setDirection(LiftPosition.REST);
                    System.out.println(liftStatus);
                }
            }
        }
        LiftSPositionDB.LIFT_CURRENT_POSITION.put(ElevatorStateConstant.LIFT_AVAILABLE, true);
        liftStatus.setDestinationFloor(null);
        //Move lift upward /downward as per current state
    }


}
*/
