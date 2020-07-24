package elevator;

public interface IElevator {
    public void moveUp(Elevator e);
    public void moveDown(Elevator e);
    public void addDestination(int floor,Elevator e);
    public void stop(Elevator e);

}
