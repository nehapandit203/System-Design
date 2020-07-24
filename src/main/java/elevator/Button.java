package elevator;

public abstract class Button {

    String lightUpButton() {
        return  "Button Lights On";
    }

    public abstract String placeRequest();

    public abstract void placeRequest(int floor);
}
