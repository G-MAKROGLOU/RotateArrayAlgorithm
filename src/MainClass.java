public class MainClass {
    public static void main(String[] args){


        RotatorClass rc = new RotatorClass();
        TwoDimensionalArraysClass tdac = new TwoDimensionalArraysClass();

        System.out.println("This is the rectangle shape before any rotation");
        rc.printShape(tdac.getRectangle());
        System.out.print("\n");
        rc.rotateLeft(tdac.getRectangle());
        System.out.println("This is the rectangle shape after rotating left");
        rc.printShape(tdac.getRectangle());
        System.out.print("\n");
        rc.rotateRight(tdac.getRectangle());
        System.out.println("This is the rectangle shape after rotating left");
        rc.printShape(tdac.getRectangle());

        System.out.print("\n");

        System.out.println("This is the rhombus shape before any rotation");
        rc.printShape(tdac.getRhombus());
        System.out.print("\n");
        rc.rotateLeft(tdac.getRhombus());
        System.out.println("This is the rhombus shape after rotating left");
        rc.printShape(tdac.getRhombus());
        System.out.print("\n");
        rc.rotateRight(tdac.getRhombus());
        System.out.println("This is the rhombus shape after rotating right");
        rc.printShape(tdac.getRhombus());

        System.out.print("\n");

        System.out.println("This is the square shape before any rotation");
        rc.printShape(tdac.getSquare());
        System.out.print("\n");
        rc.rotateLeft(tdac.getSquare());
        System.out.println("This is the square shape after rotating left");
        rc.printShape(tdac.getSquare());
        System.out.print("\n");
        rc.rotateRight(tdac.getSquare());
        System.out.println("This is the square shape after rotating right");
        rc.printShape(tdac.getSquare());

        System.out.print("\n");

        System.out.println("This is the triangle shape before any rotation");
        rc.printShape(tdac.getTriangle());
        System.out.print("\n");
        rc.rotateLeft(tdac.getTriangle());
        System.out.println("This is the triangle shape after rotating left");
        rc.printShape(tdac.getTriangle());
        System.out.print("\n");
        rc.rotateRight(tdac.getTriangle());
        System.out.println("This is the triangle shape after rotating right");
        rc.printShape(tdac.getTriangle());


    }
}
