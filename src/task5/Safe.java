package task5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Safe {
    private Thing[] things;
    private int commonValue;

    public Safe(Thing[] things, int commonValue) {
        this.things = things;
        this.commonValue = commonValue;
    }

    public Thing[] getThings() {
        return things;
    }

    public int getCommonValue() {
        return commonValue;
    }

    public String getDescription() {
        if (things == null) return "";
        else return Arrays.stream(things).map(Thing::getName).collect(Collectors.joining("+")) + "-" + getCommonValue();
    }
}
