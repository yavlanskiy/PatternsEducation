package Strategy.example1;

/**
 * Created by max_yav on 27.03.2019.
 */
public enum Users {
    BEL_KO("Белка"), IR_KO("Ирка"), DIM_KO("Димка"), NATASH_KA("Наташка"), MAXIM_KO("Максимко");

    public String name;

    Users(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name.replaceAll(".$","и");
    }
}
