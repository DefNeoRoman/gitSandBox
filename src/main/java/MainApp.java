import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        try {
            Files.lines(Paths.get("src/main/resources/test.txt"), StandardCharsets.UTF_8).forEach(lines::add);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Разбить на подзадачи
        //Сделать TableObject
        //Сделать Sensor
        //Сделать Volume

    }
}
