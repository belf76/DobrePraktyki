package Task4;

public class Computer {
    private String processor;
    private int ram;

    public Computer(String processor, int ram) {
        this.processor = processor;
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
