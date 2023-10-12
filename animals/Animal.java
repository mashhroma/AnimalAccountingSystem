package animals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

abstract public class Animal {

    private static int counter;
    protected int id;
    protected String name;
    protected Date birthday;
    protected ArrayList<String> commands;

    DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");

    {
        counter++;
    }

    public Animal(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
        this.id = counter;
    }

    public void setCommand(ArrayList<String> commands) {
        this.commands = commands;
    }

    public void addCommand(ArrayList<String> commands) {
        this.commands.addAll(commands);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        String type = this.getClass().toString().split("\\.")[1].toString();
        return "Animal: " + type + " id: " + id + ", name: " + name + ", birthday: "
                + formatter.format(birthday) + ", commands: "
                + commands + ".";
    }

    public String toJSON() {
        return "{\n" +
                "\"type\":\"" + this.getClass().toString().split("\\.")[1].toString() + "\",\n" +
                "\"id\":\"" + id + "\",\n" +
                "\"name\":\"" + name + "\",\n" +
                "\"birthday\":\"" + formatter.format(birthday) + "\",\n" +
                "\"commands\":\"" + commands + "\"\n" +
                "}";
    }
}
