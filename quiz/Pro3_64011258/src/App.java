import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application{
    private static final String Media_URL = "https://liveexample.pearsoncmg.com/common/sample.mp4";

    @Override
    public void start(Stage primaryStage) throws Exception{

        Media media = new Media(Media_URL);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        Button playBt = new Button(">");
        playBt.setOnAction(e ->{
            if(playBt.getText().equals(">")){
                mediaPlayer.play();
                playBt.setText("||");
            }
            else{
                mediaPlayer.pause();
                playBt.setText(">");
            }
        });

        Button rewindBt = new Button("<<");
        rewindBt.setOnAction(e -> mediaPlayer.seek(Duration.ZERO));

        //Slider Volume 
        Slider volumeSlider = new Slider();
        volumeSlider.setPrefWidth(150);
        volumeSlider.setMaxWidth(Region.USE_PREF_SIZE);
        volumeSlider.setMinWidth(30);
        volumeSlider.setValue(50);
        mediaPlayer.volumeProperty().bind(
            volumeSlider.valueProperty().divide(100)
        ); 

        //Hbox
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(playBt, rewindBt, new Label("Volume"), volumeSlider);

        //Pane
        BorderPane pane = new BorderPane();
        pane.setCenter(mediaView);
        pane.setBottom(hBox);

        //Scene
        Scene scene = new Scene(pane, 650, 500);
        primaryStage.setTitle("Program3");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
