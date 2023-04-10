import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Coordinates> coordinates = new ArrayList<Coordinates>();

    coordinates.add(new Coordinates(5, 3));
    coordinates.add(new Coordinates(16, 10));

    System.out.println("Distance coordinates 0 to coordinates 1 is : " + coordinates.get(0).DistanceTo(coordinates.get(1)));
  }

}