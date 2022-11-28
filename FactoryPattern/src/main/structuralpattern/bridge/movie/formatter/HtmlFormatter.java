package main.structuralpattern.bridge.movie.formatter;

import main.structuralpattern.bridge.movie.Detail;

import java.util.List;

public class HtmlFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<table>");
        stringBuffer.append("<th>");
        stringBuffer.append("Classification");
        stringBuffer.append("</th>");
        stringBuffer.append("<th>");
        stringBuffer.append(header);
        stringBuffer.append("</th>");

        details.forEach(detail -> {
            stringBuffer.append("<tr><td>");
            stringBuffer.append(detail.getLabel());
            stringBuffer.append("</td><td>");
            stringBuffer.append(detail.getValue());
            stringBuffer.append("</td></tr>");
        });
        stringBuffer.append("</table>");
        return stringBuffer.toString();
    }
}
