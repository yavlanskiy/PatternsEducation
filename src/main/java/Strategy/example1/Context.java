package Strategy.example1;

import Strategy.example1.strategy.StrategySorting;

/**
 * Created by max_yav on 27.03.2019.
 */
public class Context {

    private StrategySorting strategy;

    public void setStrategy(StrategySorting strategy) {
        this.strategy = strategy;
    }

    public int [] executeStrategy(int [] mass){
        return strategy.execute(mass);
    }

}
