import java.util.Arrays;
import java.util.Scanner;

public class LightsOutR3 {
    public static boolean lightsMatch(int[] lights, int[] target){
        if (lights.length != target.length) {
            throw new IllegalArgumentException("arr length must match");

        }
        for (int i = 0; i < lights.length; i++) {
            if (lights[i] != target[i]) {
                return false;
            }
        }
        return true;
    }

    public static void addLights(int[] lights, int[] addVals){
        if (lights.length != addVals.length) {
            throw new IllegalArgumentException("arr length must match");

        }
        for (int i = 0; i < lights.length; i++) {
            lights[i] += addVals[i];
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        int[] lights = {0,0,0};
        int[] lightSolution = {0,1,2};
        int[] buttonA = {1,1,0};
        int[] buttonB = {1,1,1};
        int[] buttonC = {0,1,1};

        while (!lightsMatch(lights, lightSolution)) {
            System.out.println("Current state:\t\t" + Arrays.toString(lights));
            System.out.println("Desired Solution:\t" + Arrays.toString(lightSolution));
            System.out.println("Options: ");
            System.out.println("\tButtonA: " + Arrays.toString(buttonA));
            System.out.println("\tButtonB: " + Arrays.toString(buttonB));
            System.out.println("\tButtonC: " + Arrays.toString(buttonC));

            
        }

        console.close();
    }
}
