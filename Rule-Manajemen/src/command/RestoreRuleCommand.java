package command;

import controller.RuleController;

public class RestoreRuleCommand implements Command {
    private RuleController controller;

    public RestoreRuleCommand(RuleController controller) {
        this.controller = controller;
    }

    @Override
    public void execute() {
        controller.restore();
    }
}
