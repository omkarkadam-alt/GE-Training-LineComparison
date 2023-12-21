public class Line {
    private Point startPoint, endPoint;
    public double length;

    Line(Point point1, Point point2) {
        this.startPoint = point1;
        this.endPoint = point2;

        this.length = Math.pow((Math.pow(endPoint.x -  startPoint.x, 2) + Math.pow(endPoint.y - startPoint.y, 2)), 0.5);
    }

    public boolean equals(Line otherLine) {
        if (this == otherLine) {
            return true;
        }

        return this.startPoint.equals(otherLine.startPoint) && this.endPoint.equals(otherLine.endPoint);
    }

    public int compareTo(Line otherLine) {
        return Double.compare(this.length, otherLine.length);
    }
}