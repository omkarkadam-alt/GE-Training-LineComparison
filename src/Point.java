class Point {
    public double x;
    public double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Point secondPoint) {
        if (this == secondPoint) {
            return true;
        }

        return this.x == secondPoint.x && this.y == secondPoint.y;
    }
}