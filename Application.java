package dependency_injection;

class Application
{
  public static void main(String args[])
  {
    Triangle triangle = new Triangle();
    Circle circle = new Circle();
    Drawing drawing = new Drawing(triangle);
    drawing.DrawShape();
    drawing = new Drawing(circle);
    drawing.DrawShape();
  }
}
