package view;

import command.AddRuleCommand;
import command.Command;
import command.RestoreRuleCommand;
import command.ShowRulesCommand;
import controller.RuleController;

import java.util.Scanner;

public class RuleView {
    private RuleController controller;
    private Scanner scanner;

    public RuleView(RuleController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Menambahkan Peraturan");
            System.out.println("2. Melihat Daftar Peraturan");
            System.out.println("3. Kembalikan Peraturan Terakhir");
            System.out.println("4. Exit");
            System.out.print("Pilih opsi (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            Command command;
            switch (choice) {
                case 1:
//                    addRule();
                    command = createAddRuleCommand();
                    break;
                case 2:
//                    showRules();
                    command = new ShowRulesCommand(controller);
                    break;
                case 3:
//                    restoreRules();
                    command = new RestoreRuleCommand(controller);
                    break;
                case 4:
                    System.out.println("Keluar dari aplikasi.");
                    return;
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
                    continue;
            }
            command.execute();
        }
    }
    private Command createAddRuleCommand() {
        System.out.print("Masukkan peraturan baru: ");
        String content = scanner.nextLine();
        return new AddRuleCommand(controller, content);
    }

//    private void addRule() {
//        System.out.print("Masukkan peraturan baru: ");
//        String content = scanner.nextLine();
//        controller.addRule(content);
//        System.out.println("Peraturan berhasil ditambahkan.");
//    }
//
//    private void showRules() {
//        System.out.println("Daftar Peraturan:");
//        for (var rule : controller.getAllRules()) {
//            System.out.println(rule);
//        }
//    }
//
//    private void restoreRules() {
//        controller.restore();
//        System.out.println("Peraturan berhasil dikembalikan ke status sebelumnya.");
//    }
}
