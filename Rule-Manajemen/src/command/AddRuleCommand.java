package command;

import controller.RuleController;

public class AddRuleCommand implements Command {
    private RuleController controller;
    private String content;

    public AddRuleCommand(RuleController controller, String content) {
        this.controller = controller;
        this.content = content;
    }

    @Override
    public void execute() {
        controller.addRule(content);
    }
}
