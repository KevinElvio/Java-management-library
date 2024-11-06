package model;

public class ConcreteRuleFactory extends RuleFactory {
    @Override
    public Rule createRule(String content) {

        return new Rule(content);
    }
}
