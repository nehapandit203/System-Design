package elevator;

public class ElevatorButton extends Button {
    //ElevatorService elevatorService = new ElevatorService();
    int requestingFloor;

    public int getRequestingFloor() {
        return requestingFloor;
    }

    public void setRequestingFloor(int requestingFloor) {
        this.requestingFloor = requestingFloor;
    }

    public String placeRequest() {
        System.out.println(lightUpButton());
        System.out.println("Elevate Request made");
          return null;
    }

    public void placeRequest(int requestingFloor) {
        System.out.println(lightUpButton());
        System.out.println("Elevate Request made");

       // elevatorService.getLiftService(requestingFloor);
    }

}
