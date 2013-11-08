package control;

import java.io.FileNotFoundException;
import model.HistogramBuilder;
import userinterface.HistogramViewer;
import persistance.MailReader;

public class CalculateEmailDomainHistogramControl {

    private String filename;

    public CalculateEmailDomainHistogramControl(String filename) {
        this.filename = filename;
    }

    public void execute() {
        HistogramBuilder<String> builder = new HistogramBuilder<>();
        builder.calculateHistogram(readDomains());
        HistogramViewer<String> viewer = new HistogramViewer<>(builder.getHistogram());
        viewer.show();
    }

    private String[] readDomains() {
        MailReader reader = new MailReader();
        try {
            return reader.readDomains(filename);
        } catch (FileNotFoundException ex) {
            return new String[0];
        }
    }
}
