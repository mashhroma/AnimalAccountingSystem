import java.text.ParseException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        AccountingSystem accountingSystem = new AccountingSystem();
        Counter counter = new Counter();
        Scanner scanner = new Scanner(System.in);

        String option = "";

        while (true) {
            System.out.println(
                    "\nВведите команду:\n1. Завести нового животного \n2. Список всех животных \n3. Просмотр выполняемых команд животного \n4. Обучить животное\n5. Завершить работу\n");
            System.out.print("Введите цифру: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    try {
                        System.out.print("Введите вид животного: ");
                        String type = scanner.nextLine().toLowerCase();
                        System.out.print("Введите имя животного: ");
                        String name = scanner.nextLine();
                        System.out.print("Введите дату рождения животного в формате дд.мм.гггг: ");
                        String strDate = scanner.nextLine();
                        System.out.print("Введите команды, которые умеет делать животное, через запятую: ");
                        String commands = scanner.nextLine().toLowerCase().replaceAll("\\s", "");
                        if (type.isEmpty() || name.isEmpty() || strDate.isEmpty() || commands.isEmpty()) {
                            throw new Exception("Заполнены не все поля! Животное не добавлено в базу.");
                        }
                        accountingSystem.getAnimal(type, name, strDate, commands);
                        counter.add();
                        counter.printCounter();
                        System.out.println("Животное успешно занесено в базу.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "2":
                    System.out.println("Список всех животных в питомнике:");
                    accountingSystem.showAllAnimals();
                    break;
                case "3":
                    System.out.print("Введите id животного: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Команды, которые исполняет животное:");
                    accountingSystem.showCommands(id);
                    break;
                case "4":
                    System.out.print("Введите id животного: ");
                    int id_2 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Введите команды, которым обучили, через запятую: ");
                    String command = scanner.nextLine().toLowerCase().replaceAll("\\s", "");
                    accountingSystem.learnCommand(id_2, command);
                    System.out.println("Животное успешно обучено.");
                    break;
                case "5":
                    accountingSystem.saveToJSON();
                    System.out.println("Данные успешно сохранены в файл JSON.\nДо свидания!");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Введите команду от 1 до 5.");
                    break;
            }
        }
    }
}
