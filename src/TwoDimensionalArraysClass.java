public class TwoDimensionalArraysClass {
    private String[][] rectangle= {
            {" ", "x", "x", "x", "x", " "},
            {" ", "x", " ", " ", "x", " "},
            {" ", "x", " ", " ", "x", " "},
            {" ", "x", " ", " ", "x", " "},
            {" ", "x", " ", " ", "x", " "},
            {" ", "x", "x", "x", "x", " "}
    };


    private String[][] triangle = {
            {" ", " ", " ", " ", " ", "X"},
            {" ", " ", " ", " ", "X", "X"},
            {" ", " ", " ", "X", " ", "X"},
            {" ", " ", "X", " ", " ", "X"},
            {" ", "X", " ", " ", " ", "X"},
            {"X", "X", "X", "X", "X", "X"}
    };


    private String[][] rhombus = {
            {" ", " ", " ", "X", " ", " ", " "},
            {" ", " ", "X", " ", "X", " ", " "},
            {" ", "X", " ", " ", " ", "X", " "},
            {"X", " ", " ", " ", " ", " ", "X"},
            {" ", "X", " ", " ", " ", "X", " "},
            {" ", " ", "X", " ", "X", " ", " "},
            {" ", " ", " ", "X", " ", " ", " "}
    };

    private String[][] square = {
            {"X", "X", "X", "X", "X", "X"},
            {"X", " ", " ", " ", " ", "X"},
            {"X", " ", " ", " ", " ", "X"},
            {"X", " ", " ", " ", " ", "X"},
            {"X", " ", " ", " ", " ", "X"},
            {"X", "X", "X", "X", "X", "X"}
    };



    public String[][] getRectangle() {
        return rectangle;
    }

    public void setRectangle(String[][] rectangle) {
        this.rectangle = rectangle;
    }

    public String[][] getTriangle() {
        return triangle;
    }

    public void setTriangle(String[][] triangle) {
        this.triangle = triangle;
    }

    public String[][] getRhombus() {
        return rhombus;
    }

    public void setRhombus(String[][] rombus) {
        this.rhombus = rombus;
    }

    public String[][] getSquare() {
        return square;
    }

    public void setSquare(String[][] square) {
        this.square = square;
    }
}
