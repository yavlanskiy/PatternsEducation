package Strategy.example1.strategy;

public class BubleSortReverse implements StrategySorting {
    @Override
    public int[] execute(int[] mass) {

        for (int i = 0; i < mass.length; i++) {

            for (int j = 0; j < mass.length - 1 - i; j++) {
                if (mass[j] < mass[j + 1]) {
                    int tmp = mass[j + 1];
                    mass[j + 1] = mass[j];
                    mass[j] = tmp;
                }
            }
        }
        return mass;
    }
}