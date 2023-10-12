import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import animals.Animal;
import animals.Camel;
import animals.Cat;
import animals.Dog;
import animals.Donkey;
import animals.Horse;
import animals.Humster;

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
                Animal dog = new Dog(name, birthday);
                addAnimal(dog, commands);
                break;
            case "cat":
                Animal cat = new Cat(name, birthday);
                addAnimal(cat, commands);
                break;
            case "humster":
                Animal humster = new Humster(name, birthday);
                addAnimal(humster, commands);
                break;
            case "horse":
                Animal horse = new Horse(name, birthday);
                addAnimal(horse, commands);
                break;
            case "camel":
                Animal camel = new Camel(name, birthday);
                addAnimal(camel, commands);
                break;
            case "donkey":
                Animal donkey = new Donkey(name, birthday);
                addAnimal(donkey, commands);
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

    public void learnCommand(int id, String commands) {
        ArrayList<String> commandList = new ArrayList<>(Arrays.asList(commands.split(",")));
        for (Animal animal : allAnimals) {
            if (animal.getId() == id) {
                animal.addCommand(commandList);
            }
        }
    }

    public void saveToJSON() {
        File fileName = new File("base.json");
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < allAnimals.size(); i++) {
                if (i == allAnimals.size() - 1) {
                    writer.write(allAnimals.get(i).toJSON() + "\n");
                } else {
                    writer.write(allAnimals.get(i).toJSON() + ",\n");
                }
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
