package ar.edu.unlp.oo1.ejercicio1.logging;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class UpperCaseFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        return record.getMessage().toUpperCase() + "\n";
    }
}
