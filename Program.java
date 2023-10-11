import java.text.ParseException;

public class Program {
    public static void main(String[] args) throws ParseException {
        AccountingSystem accountingSystem = new AccountingSystem();

        accountingSystem.getAnimal("dog", "Persik", "13.10.2022", "Gav");

        accountingSystem.showAllAnimals();

        accountingSystem.learnCommand(1, "stand");

        accountingSystem.showCommands(1);

    }
}
