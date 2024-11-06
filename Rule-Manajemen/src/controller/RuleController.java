package controller;

import model.Rule;
import model.RuleFactory;
import model.RuleMemento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RuleController {
    private List<Rule> rules = new ArrayList<>();
    private Stack<RuleMemento> mementoStack = new Stack<>();
    private RuleFactory ruleFactory;

    public RuleController(RuleFactory ruleFactory) {
        this.ruleFactory = ruleFactory;
    }

    public void addRule(String content) {
        mementoStack.push(save());

        Rule rule = ruleFactory.createRule(content);
        rules.add(rule);
    }

    public List<Rule> getAllRules() {
        return rules;
    }

    public RuleMemento save() {
        List<String> ruleContents = new ArrayList<>();
        for (Rule rule : rules) {
            ruleContents.add(rule.getRuleContent());
        }
        return new RuleMemento(ruleContents);
    }

    public void restore() {
        if (!mementoStack.isEmpty()) {
            RuleMemento memento = mementoStack.pop();
            rules.clear();
            for (String content : memento.getRules()) {
                addRule(content);
            }
        } else {
            System.out.println("Tidak ada status yang bisa dikembalikan.");
        }
    }
}