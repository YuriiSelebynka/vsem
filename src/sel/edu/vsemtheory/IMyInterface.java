package sel.edu.vsemtheory;

import java.io.Serializable;

public interface IMyInterface extends Serializable {

    boolean isAdult();
    String getMaritalStatus();
    /* default String getMaritalStatus(){
        return null;
    }; */

    public final String MYCONSTANT = "Constant";
}
