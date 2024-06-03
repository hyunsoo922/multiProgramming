package chap09.ProgrammingTask04;

public class Pair<T extends Number> {
    T first;
    T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T first()
    {
        return first;
    }

    public T second()
    {
        return second;
    }

}
