package elevator;

import elevator.ElevatorButton;
import elevator.FLoorButton;
import sun.font.DelegatingShape;

import java.util.LinkedList;
import java.util.Queue;

public class ElevatorController {

    public static void main(String[] args) {

        ElevatorButton elevatorButton = new ElevatorButton();
        elevatorButton.placeRequest(5);

    }
}
