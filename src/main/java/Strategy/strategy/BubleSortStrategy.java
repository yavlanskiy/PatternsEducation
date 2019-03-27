package Strategy.strategy;

/**
 * Created by max_yav on 27.03.2019.
 */
public class BubleSortStrategy implements StrategySorting {

    public int[] execute(int[] mass) {
        System.out.println("Сортирую пузырьком");
        for (int i = 0; i <= mass.length - 1; i++) {
            for (int j = i + 1; j <= mass.length-1; j++) {
                if (mass[i] > mass[j]) {
                    int temp = mass[i];
                    mass[i] = mass[j];
                    mass[j] = temp;
                }
            }
        }
        return mass;
    }
}
