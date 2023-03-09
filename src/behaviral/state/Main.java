package behaviral.state;

public class Main {
    public static void main(String[] args) {
        StateContext context = new StateContext();

        State startState = new StartState();
        startState.doAction(context);

        System.out.println("Start state: " + context.getState().toString());

        State stopState = new StopState();
        stopState.doAction(context);

        System.out.println("Stop state: " +context.getState().toString());
    }
}
