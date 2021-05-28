public class WorksWFile {
    private String filename = null;
    public void initialize(String name){
        this.filename = name;
    }
    public void initialize(String folder, String name){
        this.filename = folder + name;
    }

    public static void main(String[] args) {
        WorksWFile file = new WorksWFile();
        file.initialize("C:\\TEMP\\test.txt");

        WorksWFile file2 = new WorksWFile();
        file2.initialize("Temp", "test.txt");
//        String text = file2.readText();

    }
}
