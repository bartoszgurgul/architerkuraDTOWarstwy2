package main.structuralpattern.bridge.movie.formatter;

import main.structuralpattern.bridge.movie.Detail;

import java.util.List;

public class PrintFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(header);
        stringBuffer.append("\n");
        details.forEach(detail -> {
            stringBuffer.append(detail.getLabel());
            stringBuffer.append(":");
            stringBuffer.append(detail.getValue());
            stringBuffer.append("\n");
        });
        return stringBuffer.toString();
    }
}
