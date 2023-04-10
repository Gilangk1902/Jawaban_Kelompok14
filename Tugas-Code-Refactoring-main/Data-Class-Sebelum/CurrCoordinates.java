class Coordinates{
  
  private int x, y;

  Coordinates(int x, int y){
    this.x = x;
    this.y = y;
  }

  
  public String getAllCoordinates(){
    return x + " " + y ;
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }

  public int DistanceTo(int targetX, int targetY){
    int delta_X = Math.abs(x - targetX);
    int delta_Y = Math.abs(y - targetY);

    return Math.sqrt(Math.pow(delta_X, 2) + Math.pow(delta_Y, 2));
  }
}