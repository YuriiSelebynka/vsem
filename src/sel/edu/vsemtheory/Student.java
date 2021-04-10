package sel.edu.vsemtheory;

public class Student extends Person implements IMyInterface{
    private int course;

    @Override
    public boolean isRecruit() {
        return false;
    }

    @Override
    public boolean isAdult() {
        return false;
    }

    @Override
    public String getMaritalStatus() {
        return null;
    }
}
