import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Form {
    public static void consoleOutput(String msg) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
        System.out.format("    [%s]: %s\n", dateFormat.format(new Date()),msg);
    }
}
