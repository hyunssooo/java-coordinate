package coordinate;

import java.util.List;
import java.util.Objects;

public class Line {
    List<Point> points;
    public Line(List<Point> points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(points, line.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

    public double calculateDistance() {
        return points.get(0).calculate(points.get(1));
    }
}
