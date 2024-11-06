package command;

import controller.RuleController;

public class ShowRulesCommand implements Command {
    private RuleController controller;

    public ShowRulesCommand(RuleController controller) {
        this.controller = controller;
    }

    @Override
    public void execute() {
        for (var rule : controller.getAllRules()) {
            System.out.println(rule);
        }
    }
}
