package structural.decorator;

public class DecoratorService {
    public static void main(String[] args) {
        DataSource source = new FileDS("Text1.txt");
        source = new EncryptionDecorator(source);
        source.writeData("My Name is Billa");
        System.out.println(source.readData());
    }
}
