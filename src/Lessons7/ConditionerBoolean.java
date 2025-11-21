package Lessons7;

public class ConditionerBoolean {
    static void main() {
        int temp = 30;
        boolean hot = temp >= 25;
        boolean cold = temp <= 22;
        int time = 23;
        boolean isNight = time > 22 || time < 6;
        if (hot && !isNight) {
            System.out.println("Кондиционер включен");
        } else if (cold) {
            System.out.println("Кондиционер выклюен");
        } else {
            System.out.println("Кондиционер ничего не делает");
        }
    }
}
