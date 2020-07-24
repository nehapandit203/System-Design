package elevator;

public interface ElevatorConstants {
    String ELEVATOR_AVAILABLE = "ELEVATOR_AVAILABLE";

    interface ElevatorStateConstant {
        String IDLE = "IDLE";//REST
        String UP = "UP";
        String DOWN = "DOWN";
    }

    interface FloorConstant {
        int MIN = 0;
        int MAX = 10;
    }

}
