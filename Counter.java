public class Counter {

    static int counter;

    public void add() {
        counter++;
    }

    public void printCounter() {
        System.out.println("Всего успешно заведено животных: " + counter);
    }

}
