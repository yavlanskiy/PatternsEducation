package Strategy.example1;

import Strategy.example1.strategy.BubleSortReverse;
import Strategy.example1.strategy.BubleSortStrategy;
import Strategy.example1.strategy.SelectionSortStrategy;

import java.util.Arrays;

/**
 * Created by max_yav on 27.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        // Массив который нужно отсортировать.
        final int[] mass = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0, 1, 4, 5};

        Users name = Users.BEL_KO;

        switch (name){
            case IR_KO:
                break;
            case DIM_KO:
                break;
            case MAXIM_KO:
                context.setStrategy(new BubleSortStrategy());
                break;
            case NATASH_KA:
                context.setStrategy(new SelectionSortStrategy());
                break;
            case BEL_KO:
                context.setStrategy(new BubleSortReverse());
                break;
        }
        System.out.println("Массив до сортировки" + Arrays.toString(mass));

        int[] ints = context.executeStrategy(mass);

        System.out.println("Стратегия от " + name);
        System.out.println("Массив после сортировки" + Arrays.toString(ints));
    }
}
