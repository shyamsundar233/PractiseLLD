package structural.decorator;

public class EncryptionDecorator implements DataSource{

    private DataSource dataSource;

    public EncryptionDecorator(DataSource source){
        this.dataSource = source;
    }

    @Override
    public String readData() {
        String content = dataSource.readData();
        return decrypt(content);
    }

    @Override
    public void writeData(String content) {
        String encryptContent = encrypt(content);
        dataSource.writeData(encryptContent);
    }

    private String encrypt(String data) {
        System.out.println("Data Encrypted....");
        return "encrypt:" + data;
    }

    private String decrypt(String data) {
        System.out.println("Data Decrypted....");
        return data.replace("encrypt:", "");
    }
    
}
