package model;

public class HistogramBuilder<Key> {

    Histogram<Key> histogram = new Histogram();

    public void calculateHistogram(Key[] array) {
        for (Key item : array) {
            histogram.put(item, getFrecuency(item) + 1);
        }
    }

    public Histogram<Key> getHistogram() {
        return histogram;
    }

    public Integer getFrecuency(Key item) {
        Integer value = histogram.get(item);
        if (value == null) {
            return 0;
        }
        return value;
    }
}
