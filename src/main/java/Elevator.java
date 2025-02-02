abstract class Elevator {
    protected ElevatorState state;
    protected int currentFloor = 1;
    protected Integer destinationFloor = null; 

    public abstract void call(int floor);

    public ElevatorState state() {
        return state;
    }

    public void step() {
        switch (state) {
            case MOVING_UP:
                if (currentFloor < destinationFloor) {
                    currentFloor++;
                }
                break;
            case MOVING_DOWN:
                if (currentFloor > destinationFloor) {
                    currentFloor--;
                }
                break;
            case STATIONARY:
            case OUT_OF_ORDER:
                break;
        }
    }
}