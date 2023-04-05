package dio.me.csb.academia.util;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeDIO {
    private TimeDIO() {}

    private  static final Locale LOCALE_BR = new Locale("pt", "BR");

    public static final DateTimeFormatter LOCAL_DATE_TIME_FORMATTER_PTBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", LOCALE_BR);
    public static final DateTimeFormatter LOCAL_DATE_FORMATTER_PTBR = DateTimeFormatter.ofPattern("dd/MM/yyyy", LOCALE_BR);

}
