class Main {
    public static void main(String[] args) {
        int squareSide = 7;
        int rectangleWidth = 8;
        int rectangleHeight = 3;
        int circleRadius = 10;

        calc("square", squareSide, 0);
        calc("rectangle", rectangleWidth, rectangleHeight);
        calc("circle", circleRadius, 0);
    }

    public static void calc(String type, int side, int width) {
        float area = 0;

        if (type.equals("square")) {
            area = side * side;
        } else if (type.equals("rectangle")) {
            area = side * width;
        } else if (type.equals("circle")) {
            area = 3.14f * side * side;
        }

        System.out.println("Area of " + type + " : " + area);
    }
}
