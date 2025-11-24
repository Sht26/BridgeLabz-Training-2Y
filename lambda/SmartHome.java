package lambda;

interface LightAction {
    void execute();
}

public class SmartHome {
    public static void main(String[] args) {

        // Different light behaviors using lambdas
        LightAction motionTrigger = () -> System.out.println("Lights ON with soft white glow.");
        LightAction nightTrigger = () -> System.out.println("Dim lights to 20% at night.");
        LightAction voiceTrigger = () -> System.out.println("Colorful party mode activated!");

        // Simulating triggers
        activateLight(motionTrigger);
        activateLight(nightTrigger);
        activateLight(voiceTrigger);
    }

    static void activateLight(LightAction action) {
        action.execute();
    }
}

