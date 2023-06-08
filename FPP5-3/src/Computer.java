import java.util.Objects;

public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    double processorSpeed;

    Computer(String manufacturer, String processor, int ramSize, double processorSpeed){
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this. processorSpeed = processorSpeed;
    }

    public int getRamSize() {return ramSize;}
    public double getProcessorSpeed(){return processorSpeed;}
    public double computePower(){
        return ramSize*processorSpeed;
    }
    public String toString(){
        return "Manufacturer: " + manufacturer + ", Processor: " + processor +
                ", RAM's size: " + ramSize + ", Processor's speed: " + processorSpeed;
    }

    public boolean equals(Object obj){
        if (obj instanceof Computer){
            Computer another = (Computer) obj;
            if(this.manufacturer.equals(another.manufacturer) &&
                this.processor.equals(another.processor) &&
                    this.ramSize == another.ramSize &&
                    this.processorSpeed == another.processorSpeed){
                return true;
            }
        }
        return false;
    }

    public int hashCode(){
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }
}
