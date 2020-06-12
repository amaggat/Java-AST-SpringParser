package Model;

import java.util.List;
import java.util.Set;

public class ClassConstructor extends NamedEntity{

    public ClassConstructor(String name, List<String> input, List<String> status) {
        super.setName(name);
        super.setStatus(status);
        this.input = input;
    }

    private List<String> input;

    public List<String> getInput() {
        return input;
    }

    public void setInput(List<String> input) {
        this.input = input;
    }
}
