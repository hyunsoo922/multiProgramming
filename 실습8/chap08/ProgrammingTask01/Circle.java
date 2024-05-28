package chap08.ProgrammingTask01;

import java.util.Objects;

public class Circle {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    public boolean equals(Circle circle) {
        if(circle.r == r)
        {
            return true;
        }
        return false;
    }

}
