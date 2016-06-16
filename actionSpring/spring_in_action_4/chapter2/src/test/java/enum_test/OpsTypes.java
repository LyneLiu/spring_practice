package enum_test;

/**
 * Created by nn_liu on 2016/5/30.
 */
public enum OpsTypes {

    CREATE("C"),UPDATE("U"),READ("R"),DELETE("D");

    public final String name;

    private OpsTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}