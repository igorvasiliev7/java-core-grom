package lesson11.biginterfaceexample;

public class File {
    private String name;
    private String path;
    private String extension;

    public File(String name, String path, String extension, String size) {
        this.name = name;
        this.path = path;
        this.extension = extension;
        this.size = size;
    }

    private String size;

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getExtension() {
        return extension;
    }

    public String getSize() {
        return size;
    }

    public File() {
    }
}
