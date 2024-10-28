
public class Line {
    private Point start;
    private Point end;

    public Line() {
        this.start = new Point(0.0, 0.0);
        this.end = new Point(0.0, 0.0);
    }

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(double x1, double y1, double x2, double y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    // Геттеры и сеттеры
    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public String toString() {
        return "Линия от " + start.toString() + " до " + end.toString();
    }

    public int getDistance() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return (int) Math.round(Math.sqrt(dx*dx + dy*dy));
    }
}