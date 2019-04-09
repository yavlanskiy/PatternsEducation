package MarkerInterface;

import java.io.Serializable;

public class BigObject implements Serializable {

    private int id;

    public void setId(final int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
