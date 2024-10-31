package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
//        // Tạo một nhãn với văn bản mặc định
//        Label label = new Label("Hello, JavaFX!");
//
//        // Tạo một nút với văn bản "Click me!"
//        Button button = new Button("Click me!");
//        
//        // Xử lý sự kiện khi nút được nhấp
//        button.setOnAction(e -> {
//            label.setText("Button clicked!");
//        });
//
//        // Tạo một layout VBox để chứa nhãn và nút
//        VBox root = new VBox(10);
//        root.getChildren().addAll(label, button);
//
//        // Tạo một Scene với layout VBox
//        Scene scene = new Scene(root, 300, 200);
//
//        // Đặt Scene vào Stage
//        primaryStage.setScene(scene);
//
//        // Đặt tiêu đề cho cửa sổ
//        primaryStage.setTitle("JavaFX Example");
//
//        // Hiển thị cửa sổ
//        primaryStage.show();
//    	@Override
//    	public void start(Stage primaryStage) {
    		try {
    			// Tạo thành phần UI nút bấm và trường text 
    			Button btn = new Button("Xem ngày giờ abc");
    			TextField tf = new TextField();
    			
    			// Xử lý sự kiện bấm nút
    			btn.setOnAction(new EventHandler<ActionEvent>() {
    				
    				@Override
    				public void handle(ActionEvent arg0) {
    					// TODO Auto-generated method stub
    					
    				}
    			});
    			
    			
    			// Thêm nút bấm , trường text vào layout Hbox
    			HBox root = new HBox();
    			root.getChildren().addAll(btn, tf);
    			
    			// Thêm layou vào khung chứa Scene
    			Scene scene = new Scene(root,300,100);
    			
    			// Thêm Scene vào khung chứa Stage
    			primaryStage.setScene(scene);
    			
    			// Đặt tiêu đề cho khung chứa Stage và hiển thị
    			primaryStage.setTitle("Ví dụ JAVAFX");
    			primaryStage.show();
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	
    }
    		
    	
    	
    	

    public static void main(String[] args) {
        // Khởi chạy ứng dụng JavaFX
        launch(args);
    }
}
