package elevator;

public enum ElevatorState implements ElevatorConstants {
    UP(ElevatorStateConstant.UP),
    DOWN(ElevatorStateConstant.DOWN),
    STOP(ElevatorStateConstant.STOP),
    IDLE(ElevatorStateConstant.IDLE);


    private String name;

    private ElevatorState(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
