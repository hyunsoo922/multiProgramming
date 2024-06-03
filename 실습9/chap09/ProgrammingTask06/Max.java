package chap09.ProgrammingTask06;

public class Max<T> {

    public T max(T x, T y) {
        if (x instanceof Number && y instanceof Number) {
            double numX = ((Number) x).doubleValue();
            double numY = ((Number) y).doubleValue();
            return (T) (numX > numY ? x : y);
        } else if (x instanceof String && y instanceof String) {
            String strX = (String) x;
            String strY = (String) y;
            return (T) (strX.length() > strY.length() ? x : y);
        } else {
            throw new IllegalArgumentException();
        }
    }

}
