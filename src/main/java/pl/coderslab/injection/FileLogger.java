package pl.coderslab.injection;

import java.io.FileWriter;

public class FileLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("saving to file");

        try (FileWriter filewriter = new FileWriter("LogInsFile.txt", true)) {
            filewriter.write(message);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
