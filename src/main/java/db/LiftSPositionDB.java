package db;

import elevator.ElevatorConstants;

import java.util.HashMap;
import java.util.Map;


public class LiftSPositionDB implements ElevatorConstants {
    public static Map<String, Boolean> LIFT_CURRENT_POSITION = createMap();

    private static Map<String, Boolean> createMap() {
        Map<String, Boolean> liftavailibilty = new HashMap<String, Boolean>();
        liftavailibilty.put(ELEVATOR_AVAILABLE, true);
        return liftavailibilty;
    }

    public static Boolean getLiftCurrentPosition() {
        return LIFT_CURRENT_POSITION.get(ELEVATOR_AVAILABLE);
    }

    public static void setLiftCurrentState(Boolean state) {
        LIFT_CURRENT_POSITION.put(ELEVATOR_AVAILABLE, state);
    }
}
