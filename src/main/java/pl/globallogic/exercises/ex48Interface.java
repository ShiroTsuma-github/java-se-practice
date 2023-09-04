package pl.globallogic.exercises;

import java.util.ArrayList;
import java.util.List;

public class ex48Interface {
    interface ISaveable {
        List<String> write();

        void read(List<String> savedValues);
    }
}
