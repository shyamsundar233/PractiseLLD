package structural.decorator;

public class FileDS implements DataSource{

    private String fileName;
    private String content;

    public FileDS(String fileName){
        this.fileName = fileName;
    }

    @Override
    public String readData() {
        return fileName + ": " + content;
    }

    @Override
    public void writeData(String content) {
        this.content = content;
        System.out.println("Content: " + content + " Written to " + fileName);
    }
    
}
