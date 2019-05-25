package coordinate.model;

import coordinate.model.creator.PointsGenerator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LineTest {

    @Test
    void 라인_생성_테스트() {
        Point testPoint1 = new Point(new Value(1), new Value(1));
        Point testPoint2 = new Point(new Value(2), new Value(2));
        Line testLine = new Line(Arrays.asList(testPoint1, testPoint2));
        assertThat(testLine).isEqualTo(new Line(Arrays.asList(testPoint1, testPoint2)));
    }

    @Test
    void 거리_계산_테스트() {
        Line line = new Line(PointsGenerator.makePoints("(0,0)-(2,0)"));
        assertThat(line.distance()).isEqualTo(2.0);
    }
}
