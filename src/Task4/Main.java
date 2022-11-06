package Task4;

public class Main {
    public static void main(String[] args) {
        Owner mike = new Owner("Mike", "Saiko");
        Computer computer = new Computer("Intel", 60);
        System.out.println("Hello I am:" + mike.name);
        System.out.println("and I have " + computer.getProcessor() + " processor");
    }
}
