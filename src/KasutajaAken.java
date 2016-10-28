import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Liina on 28.10.2016.
 */
public class KasutajaAken extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane grid = new GridPane();
        Stage stage = new Stage();
        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Minu graafik");

        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        grid.setPadding(new Insets(25, 25, 25, 25));
        Text pealkiri = new Text("Sisestage oma kasutajatunnus ja parool!");
        pealkiri.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(pealkiri, 0, 0, 2, 1);


        TextField kasutajaSisend = new TextField();
        grid.add(kasutajaSisend, 1, 1);

        Label salasona = new Label("Salasõna:");
        grid.add(salasona, 0, 2);

        Label kasutajaTunnus = new Label("Kasutajanimi:");
        grid.add(kasutajaTunnus,0, 1);

        PasswordField parooliSisend = new PasswordField();
        grid.add(parooliSisend, 1, 2);




        Button button = new Button("Logi sisse");
        HBox hboxButton = new HBox(10);
        hboxButton.setAlignment(Pos.BOTTOM_RIGHT);
        hboxButton.getChildren().add(button);
        grid.add(hboxButton, 1, 4);

        Text logimisTekst = new Text();
        grid.add(logimisTekst, 1, 6);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String kasutaja = kasutajaSisend.getText();
                String salasona = parooliSisend.getText();
                logimisTekst.setFill(Color.GREEN);


                if(kasutaja.equals("Kasutaja")&&salasona.equals("Parool")){
                    logimisTekst.setText("Sisse logimine õnnestus");
                }else{
                    logimisTekst.setText("Vale kasutajatunnus või parool");
                }
            }
        });

        stage.show();


    }
}
