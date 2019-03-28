package Strategy.example1.strategy;

/**
 * Created by max_yav on 27.03.2019.
 */
public class SelectionSortStrategy implements StrategySorting {
    public int[] execute(int[] mass) {
        System.out.println("Сортирую выбором");
        for (int left = 0; left < mass.length; left++) {
            int min = left;
            for (int i = left; i < mass.length; i++) {
                if (mass[i] < mass[min]) {
                    min = i;
                }
            }

            int temp = mass[left];
            mass[left] = mass[min];
            mass[min] = temp;
        }
        return mass;
    }
}
