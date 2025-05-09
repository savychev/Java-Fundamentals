package opdrachten.whyPhone;

public interface ISimCard {
    default void startCall(String number) {
    }

    default void endCall() {
    }
}
