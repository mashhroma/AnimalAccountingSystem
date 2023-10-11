import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import animals.Animal;
import animals.Dog;

public class AccountingSystem {

    private ArrayList<Animal> allAnimals = new ArrayList<>();

    private void addAnimal(Animal animal, String commands) {
        ArrayList<String> commandList = new ArrayList<>(Arrays.asList(commands.split(",")));
        animal.setCommand(commandList);
        allAnimals.add(animal);
    }

    public void getAnimal(String type, String name, String strDate, String commands) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date birthday = formatter.parse(strDate);
        switch (type) {
            case "dog":
                Animal animal = new Dog(name, birthday);
                addAnimal(animal, commands);
                break;
            default:
                break;
        }
    }

    public void showAllAnimals() {
        for (Animal animal : allAnimals) {
            System.out.println(animal);
        }
    }

    public void showCommands(int id) {
        for (Animal animal : allAnimals) {
            if (animal.getId() == id) {
                for (String command : animal.getCommands()) {
                    System.out.println(command);
                }
            }
        }
    }

    public void showCommands(String name) {
        for (Animal animal : allAnimals) {
            if (animal.getName().equals(name)) {
                for (String command : animal.getCommands()) {
                    System.out.println(command);
                }
            }
        }
    }

    public void learnCommand(int id, String commands) {
        ArrayList<String> commandList = new ArrayList<>(Arrays.asList(commands.split(",")));
        for (Animal animal : allAnimals) {
            if (animal.getId() == id) {
                animal.addCommand(commandList);
            }
        }
    }

    public void learnCommand(String name, String commands) {
        ArrayList<String> commandList = new ArrayList<>(Arrays.asList(commands.split(",")));
        for (Animal animal : allAnimals) {
            if (animal.getName().equals(name)) {
                animal.addCommand(commandList);
            }
        }
    }

}
