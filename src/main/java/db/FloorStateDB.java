package db;

import elevator.ElevatorConstants;

import java.util.HashMap;
import java.util.Map;


public class FloorStateDB implements ElevatorConstants.FloorConstant {
    public static Map<Integer, Boolean> FLOORS_STATE_MAP = createMap();

    private static Map<Integer, Boolean> createMap() {
        Map<Integer, Boolean> floorsStateMap = new HashMap<Integer, Boolean>();
        for (int i = MIN; i <= MAX; i++) {
            floorsStateMap.put(i, false);
        }
        return floorsStateMap;
    }

}
