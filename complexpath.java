package straightline;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class complexpath extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Creating a Path
        Path path=new Path();
        //Moving to the starting point
        MoveTo moveTo=new MoveTo(108,71);
        //Creating 1st line
        LineTo line1=new LineTo(321,161);
        //Creating 2nd line
        LineTo line2=new LineTo(126,232);
        //Creating 3rd line
        LineTo line3=new LineTo(232,52);
        //Creating 4th line
        LineTo line4=new LineTo(269,250);
        //Creating 5th line
        LineTo line5=new LineTo(108,71);
        //Adding all the elements to the path
        path.getElements().add(moveTo);
        path.getElements().addAll(line1,line2,line3,line4,line5);
        Group root=new Group(path);
        Scene scene=new Scene(root,600,300);
        primaryStage.setTitle("drawing an arc through a path");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[]args)
    {
        launch(args);
    }
}
