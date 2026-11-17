package structural.decorator;

public interface DataSource {
    String readData();
    void writeData(String content); 
}
