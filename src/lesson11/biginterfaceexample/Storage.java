package lesson11.biginterfaceexample;

public class Storage {
    public File[] getFiles() {
        return files;
    }

    private File[] files=new File[5];

    public Storage(File[] files) {
        this.files=files;
    }
}
