import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Snowman extends Application{
  public void start(Stage stage){

    final int MAX_X = 400;
    final int MAX_Y = 400;
    final int CENTER_X = 200;
    final int CENTER_Y = 400;
    final int BIG_RADIUS = 160;
    final int ARM_LENGTH = 120;
    final int ARM_WIDTH = 20;

    Circle body1 = new Circle(CENTER_X, CENTER_Y+100, BIG_RADIUS, Color.WHITE);
    Circle body2 = new Circle(CENTER_X, CENTER_Y-60, BIG_RADIUS-60, Color.WHITE);
    Circle body3 = new Circle(CENTER_X, CENTER_Y-200, BIG_RADIUS-80, Color.WHITE);
    Rectangle armLeft = new Rectangle(CENTER_X-100, CENTER_Y-200, ARM_LENGTH, ARM_WIDTH, Color.BROWN);
    Rectangle armRight = new Rectangle(CENTER_X+100, CENTER_Y-200, ARM_LENGTH, ARM_WIDTH, Color.BROWN);

    Group snowman = new Group(armLeft, armRight, body1, body2, body3);
    Scene scene = new Scene(snowman, 400, 800, Color.LIGHTBLUE);

    stage.setTitle("Snowman");
    stage.setScene(scene);
    stage.show();

  }

  public static void main(String[] args){
    launch(args);
  }
}
