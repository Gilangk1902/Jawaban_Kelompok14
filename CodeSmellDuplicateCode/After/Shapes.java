import java.util.Scanner;
//Solution : make a resultPrint method, change calculate mehtod to return a val
class Shapes {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        do {
            System.out.println("Menu\n========");
            System.out.println("1. Calculate Rectangle Area");
            System.out.println("2. Calculate Square Area");
            System.out.println("3. Calculate Circle Area");
            System.out.println("0. Exit");
            System.out.print("Input: ");

            int result = 0;
            String shapeName = "";
            input = scanner.nextInt();
            if (input == 1) {
                shapeName = "Rectangle";
                result = Calculator.calculateRectangleArea();
            } else if (input == 2) {
                shapeName = "Square";
                result = Calculator.calculateSquareArea();
            } else if (input == 3) {
                shapeName = "Circle";
                result = Calculator.calculateCircleArea();
            }

            PrintResult(input, shapeName, result);
        } while (input != 0);

        scanner.close();
    }

    public static void PrintResult(int input, String shapeName, int result){
        if(input >= 1 && input <= 3){
            System.out.println("Area of " + shapeName + " is " + String.valueOf(result));
        }
    }

}

class Calculator{
    public static int calculateSquareArea() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter side length: ");
        int side = scanner.nextInt();

        scanner.close();
        return side*side;
    }

    public static int calculateRectangleArea() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter width: ");
        int width = scanner.nextInt();

        System.out.print("Enter height: ");
        int height = scanner.nextInt();

        scanner.close();

        return width*height;
    }   

    public static int calculateCircleArea() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter radius: ");
        double radius = (double) scanner.nextInt();

        
        scanner.close();

        return (int)(3.14f*radius*radius);
    }
}