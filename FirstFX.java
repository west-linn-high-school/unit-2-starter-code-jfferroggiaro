import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstFX extends Application{
    public void start(Stage stage){
      Text intro = new Text(50, 10, "This is Nolan");
      Text hello = new Text(50, 200, "Hi Nolan!");
      Rectangle body = new Rectangle(50, 80, 60, 100);
      Circle head = new Circle(80, 80, 40);
      Rectangle hair = new Rectangle(40, 30, 80, 30);
      Circle eyeR = new Circle(60, 80, 10);
      Circle eyeL = new Circle(100, 80, 10);

      body.setStroke(Color.BLACK);
      body.setFill(Color.BLACK);

      head.setStroke(Color.BLACK);
      head.setFill(Color.WHITE);

      hair.setStroke(Color.BROWN);
      hair.setFill(Color.BROWN);

      eyeR.setStroke(Color.BLACK);
      eyeR.setFill(Color.BLACK);

      eyeL.setStroke(Color.BLACK);
      eyeL.setFill(Color.BLACK);

      Group nolan = new Group(intro, hello, body, head, hair, eyeR, eyeL);
      Scene scene = new Scene(nolan, 150, 250, Color.LIGHTBLUE);

      stage.setTitle("FirstFX: Nolan");
      stage.setScene(scene);
      stage.show();
    }
    public static void main(String[] args){
      launch(args);
    }
}
