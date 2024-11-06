package model;

public class Rule {
    private String ruleContent;

    public Rule(String ruleContent) {
        this.ruleContent = ruleContent;
    }

    @Override
    public String toString() {
        return "Peraturan: " + ruleContent;
    }

    public String getRuleContent() {
        return ruleContent;
    }
}