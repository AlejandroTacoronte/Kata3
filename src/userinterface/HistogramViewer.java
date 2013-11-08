package userinterface;

import model.Histogram;

public class HistogramViewer<Key> {

    public Histogram<Key> histogram;

    public HistogramViewer(Histogram<Key> histogram) {
        this.histogram = histogram;
    }

    public void show() {
        for (Key integer : histogram.keySet()) {
            System.out.println(integer + " : " + histogram.get(integer));
        }
    }
}
