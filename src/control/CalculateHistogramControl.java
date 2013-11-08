package control;

import model.Histogram;
import model.HistogramBuilder;
import userinterface.HistogramViewer;

public class CalculateHistogramControl<Key> {

    private Key[] array;

    public CalculateHistogramControl(Key[] array) {
        this.array = array;
    }

    public void execute() {
        HistogramBuilder histogramBuilder = new HistogramBuilder();
        histogramBuilder.calculateHistogram(array);
        Histogram histogram = histogramBuilder.getHistogram();
        HistogramViewer viewer = new HistogramViewer(histogram);
        viewer.show();
    }
}
