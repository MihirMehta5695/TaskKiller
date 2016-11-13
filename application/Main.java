package application;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application
{

	public static void main(String[] args) 
	{
			launch(args);
	}

	@Override
	public void start(Stage primarystage) throws Exception 
	{
		primarystage.setTitle("Advanced Task Killer");
	
		Label lable=new Label("Advanced Task Killer");
		VBox root=new VBox();
		
		Button btn_exit =new Button();
		btn_exit.setText("Exit");
		btn_exit.setOnAction(new EventHandler<ActionEvent>()
								{
									@Override
									public void handle(ActionEvent arg0) 
									{
										System.exit(0);
									}
								}
							);
		root.getChildren().addAll(new Label("Advanced Task Killer"),btn_exit);
		Scene scene =new Scene(root,250,250);
		primarystage.setScene(scene);
		primarystage.show();
		
	}
	
	

}
