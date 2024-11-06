import controller.RuleController;
import model.ConcreteRuleFactory;
import view.RuleView;

public class Main {
    public static void main(String[] args) {
        ConcreteRuleFactory factory = new ConcreteRuleFactory();
        RuleController controller = new RuleController(factory);
        RuleView view = new RuleView(controller);
        view.showMenu();
    }
}