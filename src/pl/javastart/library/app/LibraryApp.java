package pl.javastart.library.app;

public class LibraryApp {
    private static final String APP_NAME = "Biblioteka v 1.0";
    public static void main(String[] args) {
        final String appName = "Biblioteka v 0.9";
        System.out.println(APP_NAME);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}
