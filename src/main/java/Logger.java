import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    protected int num = 1;

    Date date = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy.MM.dd");

    public void log(String msg) {
        System.out.println("[" + dateFormat.format(date) + " " + num++ + "] " + msg);
    }

    private static Logger logger = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
