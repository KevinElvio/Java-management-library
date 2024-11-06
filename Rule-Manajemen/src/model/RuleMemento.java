package model;

import java.util.ArrayList;
import java.util.List;

public class RuleMemento {
    private final List<String> rules;

    public RuleMemento(List<String> rules) {
        this.rules = new ArrayList<>(rules);
    }

    public List<String> getRules() {
        return rules;
    }
}