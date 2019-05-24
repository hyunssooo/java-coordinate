package coordinate.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureFactory {
    private static final Map<Integer, FigureCreator> figures;

    static {
        figures = new HashMap<>();
        figures.put(2, new LineCreator());
        figures.put(3, new TriangleCreator());
        figures.put(4, new RectangleCreator());
    }

    static Figure getInstance(List<Point> points) {
        return figures.get(points.size()).create(points);
    }
}
