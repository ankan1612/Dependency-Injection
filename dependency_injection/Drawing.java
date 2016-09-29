package dependency_injection;

public class Drawing
{
  private Shape shape;
  //constructor injection
  public Drawing(Shape shape)
  {
    this.shape = shape;
  }
  public void DrawShape()
  {
    this.shape.draw();
  }
}
