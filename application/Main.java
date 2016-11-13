package application;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application
{

	private TableView table=new TableView();//new table which is global , and we would be displaying our the list of the processes running here !
	
	public static void main(String[] args) 
	{
			launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception 
	{
		Scene scene=new Scene(new Group());//new Scene where our table will be shown to the user
		stage.setTitle("Advanced Task Killer");//title for the application to be displayed at the titlebar of our application 
		final Label label=new Label("List of Running Processes");//label on scene
		label.setFont(new Font("Arial", 20));//setting the font of the text which would be displayed in label
		
		table.setEditable(false);//not allowing table to be edited by the user
		
		TableColumn<CheckBox,Boolean> select=new TableColumn<>();
		select.setText("Select Process");
		select.setCellFactory(new PropertyValueFactory("select"));
		
		
		TableColumn<String>
		/*primarystage.setTitle("Advanced Task Killer");
	
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
		primarystage.show();*/
		
		
		
	}
	
	

}
