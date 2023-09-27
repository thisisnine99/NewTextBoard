package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {
    static public String getDateTime() {
        LocalDateTime now = LocalDateTime.now();
        return now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }
}
