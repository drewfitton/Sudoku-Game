import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;

import java.util.Random;

import static javafx.geometry.Pos.CENTER;
import static javafx.geometry.Pos.TOP_CENTER;

public class Sudoku extends Application {

    private BorderPane mainPane = new BorderPane();
    private GridPane board = new GridPane();
    private HBox bottom = new HBox();
    private TextField input = new TextField();
    private ComboBox<Difficulty> type = new ComboBox<>();
    private Text title = new Text("Sudoku Game");
    private Text text00 = new Text();
    private Text text01 = new Text();
    private Text text02 = new Text();
    private Text text03 = new Text();
    private Text text04 = new Text();
    private Text text05 = new Text();
    private Text text06 = new Text();
    private Text text07 = new Text();
    private Text text08 = new Text();
    private Text text10 = new Text();
    private Text text11 = new Text();
    private Text text12 = new Text();
    private Text text13 = new Text();
    private Text text14 = new Text();
    private Text text15 = new Text();
    private Text text16 = new Text();
    private Text text17 = new Text();
    private Text text18 = new Text();
    private Text text20 = new Text();
    private Text text21 = new Text();
    private Text text22 = new Text();
    private Text text23 = new Text();
    private Text text24 = new Text();
    private Text text25 = new Text();
    private Text text26 = new Text();
    private Text text27 = new Text();
    private Text text28 = new Text();
    private Text text30 = new Text();
    private Text text31 = new Text();
    private Text text32 = new Text();
    private Text text33 = new Text();
    private Text text34 = new Text();
    private Text text35 = new Text();
    private Text text36 = new Text();
    private Text text37 = new Text();
    private Text text38 = new Text();
    private Text text40 = new Text();
    private Text text41 = new Text();
    private Text text42 = new Text();
    private Text text43 = new Text();
    private Text text44 = new Text();
    private Text text45 = new Text();
    private Text text46 = new Text();
    private Text text47 = new Text();
    private Text text48 = new Text();
    private Text text50 = new Text();
    private Text text51 = new Text();
    private Text text52 = new Text();
    private Text text53 = new Text();
    private Text text54 = new Text();
    private Text text55 = new Text();
    private Text text56 = new Text();
    private Text text57 = new Text();
    private Text text58 = new Text();
    private Text text60 = new Text();
    private Text text61 = new Text();
    private Text text62 = new Text();
    private Text text63 = new Text();
    private Text text64 = new Text();
    private Text text65 = new Text();
    private Text text66 = new Text();
    private Text text67 = new Text();
    private Text text68 = new Text();
    private Text text70 = new Text();
    private Text text71 = new Text();
    private Text text72 = new Text();
    private Text text73 = new Text();
    private Text text74 = new Text();
    private Text text75 = new Text();
    private Text text76 = new Text();
    private Text text77 = new Text();
    private Text text78 = new Text();
    private Text text80 = new Text();
    private Text text81 = new Text();
    private Text text82 = new Text();
    private Text text83 = new Text();
    private Text text84 = new Text();
    private Text text85 = new Text();
    private Text text86 = new Text();
    private Text text87 = new Text();
    private Text text88 = new Text();
    protected Rectangle rect00 = new Rectangle(30, 30);
    protected Rectangle rect01 = new Rectangle(30, 30);
    protected Rectangle rect02 = new Rectangle(30, 30);
    protected Rectangle rect10 = new Rectangle(30, 30);
    protected Rectangle rect11 = new Rectangle(30, 30);
    protected Rectangle rect12 = new Rectangle(30, 30);
    protected Rectangle rect20 = new Rectangle(30, 30);
    protected Rectangle rect21 = new Rectangle(30, 30);
    protected Rectangle rect22 = new Rectangle(30, 30);
    protected Rectangle rect30 = new Rectangle(30, 30);
    protected Rectangle rect31 = new Rectangle(30, 30);
    protected Rectangle rect32 = new Rectangle(30, 30);
    protected Rectangle rect40 = new Rectangle(30, 30);
    protected Rectangle rect41 = new Rectangle(30, 30);
    protected Rectangle rect42 = new Rectangle(30, 30);
    protected Rectangle rect50 = new Rectangle(30, 30);
    protected Rectangle rect51 = new Rectangle(30, 30);
    protected Rectangle rect52 = new Rectangle(30, 30);
    protected Rectangle rect60 = new Rectangle(30, 30);
    protected Rectangle rect61 = new Rectangle(30, 30);
    protected Rectangle rect62 = new Rectangle(30, 30);
    protected Rectangle rect70 = new Rectangle(30, 30);
    protected Rectangle rect71 = new Rectangle(30, 30);
    protected Rectangle rect72 = new Rectangle(30, 30);
    protected Rectangle rect80 = new Rectangle(30, 30);
    protected Rectangle rect81 = new Rectangle(30, 30);
    protected Rectangle rect82 = new Rectangle(30, 30);
    protected Rectangle rect03 = new Rectangle(30, 30);
    protected Rectangle rect04 = new Rectangle(30, 30);
    protected Rectangle rect05 = new Rectangle(30, 30);
    protected Rectangle rect13 = new Rectangle(30, 30);
    protected Rectangle rect14 = new Rectangle(30, 30);
    protected Rectangle rect15 = new Rectangle(30, 30);
    protected Rectangle rect23 = new Rectangle(30, 30);
    protected Rectangle rect24 = new Rectangle(30, 30);
    protected Rectangle rect25 = new Rectangle(30, 30);
    protected Rectangle rect63 = new Rectangle(30, 30);
    protected Rectangle rect64 = new Rectangle(30, 30);
    protected Rectangle rect65 = new Rectangle(30, 30);
    protected Rectangle rect73 = new Rectangle(30, 30);
    protected Rectangle rect74 = new Rectangle(30, 30);
    protected Rectangle rect75 = new Rectangle(30, 30);
    protected Rectangle rect83 = new Rectangle(30, 30);
    protected Rectangle rect84 = new Rectangle(30, 30);
    protected Rectangle rect85 = new Rectangle(30, 30);
    protected Rectangle rect06 = new Rectangle(30, 30);
    protected Rectangle rect07 = new Rectangle(30, 30);
    protected Rectangle rect08 = new Rectangle(30, 30);
    protected Rectangle rect16 = new Rectangle(30, 30);
    protected Rectangle rect17 = new Rectangle(30, 30);
    protected Rectangle rect18 = new Rectangle(30, 30);
    protected Rectangle rect26 = new Rectangle(30, 30);
    protected Rectangle rect27 = new Rectangle(30, 30);
    protected Rectangle rect28 = new Rectangle(30, 30);
    protected Rectangle rect33 = new Rectangle(30, 30);
    protected Rectangle rect34 = new Rectangle(30, 30);
    protected Rectangle rect35 = new Rectangle(30, 30);
    protected Rectangle rect43 = new Rectangle(30, 30);
    protected Rectangle rect44 = new Rectangle(30, 30);
    protected Rectangle rect45 = new Rectangle(30, 30);
    protected Rectangle rect53 = new Rectangle(30, 30);
    protected Rectangle rect54 = new Rectangle(30, 30);
    protected Rectangle rect55 = new Rectangle(30, 30);
    protected Rectangle rect36 = new Rectangle(30, 30);
    protected Rectangle rect37 = new Rectangle(30, 30);
    protected Rectangle rect38 = new Rectangle(30, 30);
    protected Rectangle rect46 = new Rectangle(30, 30);
    protected Rectangle rect47 = new Rectangle(30, 30);
    protected Rectangle rect48 = new Rectangle(30, 30);
    protected Rectangle rect56 = new Rectangle(30, 30);
    protected Rectangle rect57 = new Rectangle(30, 30);
    protected Rectangle rect58 = new Rectangle(30, 30);
    protected Rectangle rect66 = new Rectangle(30, 30);
    protected Rectangle rect67 = new Rectangle(30, 30);
    protected Rectangle rect68 = new Rectangle(30, 30);
    protected Rectangle rect76 = new Rectangle(30, 30);
    protected Rectangle rect77 = new Rectangle(30, 30);
    protected Rectangle rect78 = new Rectangle(30, 30);
    protected Rectangle rect86 = new Rectangle(30, 30);
    protected Rectangle rect87 = new Rectangle(30, 30);
    protected Rectangle rect88 = new Rectangle(30, 30);
    private Button newBoard = new Button("Generate new puzzle");
    private Text[][] textArr = new Text[][]{{text00, text10, text20, text30, text40, text50, text60, text70, text80},
            {text01, text11, text21, text31, text41, text51, text61, text71, text81},
            {text02, text12, text22, text32, text42, text52, text62, text72, text82},
            {text03, text13, text23, text33, text43, text53, text63, text73, text83},
            {text04, text14, text24, text34, text44, text54, text64, text74, text84},
            {text05, text15, text25, text35, text45, text55, text65, text75, text85},
            {text06, text16, text26, text36, text46, text56, text66, text76, text86},
            {text07, text17, text27, text37, text47, text57, text67, text77, text87},
            {text08, text18, text28, text38, text48, text58, text68, text78, text88}};
    private Rectangle[][] rectArr = new Rectangle[][]{{rect00, rect10, rect20, rect30, rect40, rect50, rect60, rect70, rect80},
            {rect01, rect11, rect21, rect31, rect41, rect51, rect61, rect71, rect81},
            {rect02, rect12, rect22, rect32, rect42, rect52, rect62, rect72, rect82},
            {rect03, rect13, rect23, rect33, rect43, rect53, rect63, rect73, rect83},
            {rect04, rect14, rect24, rect34, rect44, rect54, rect64, rect74, rect84},
            {rect05, rect15, rect25, rect35, rect45, rect55, rect65, rect75, rect85},
            {rect06, rect16, rect26, rect36, rect46, rect56, rect66, rect76, rect86},
            {rect07, rect17, rect27, rect37, rect47, rect57, rect67, rect77, rect87},
            {rect08, rect18, rect28, rect38, rect48, rect58, rect68, rect78, rect88}};
    Solutions sol = new Solutions();
    TextArea notes = new TextArea();
    Button hint = new Button("Hint");
    boolean[][] tfArray = new boolean[9][9];


    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sudoku");

        title.setFont(Font.font("Verdana", 30));
        title.setStroke(Color.BLACK);
        title.setFill(Color.WHITE);
        title.setTextAlignment(TextAlignment.CENTER);
        mainPane.setTop(title);
        mainPane.setAlignment(title, CENTER);
        mainPane.setMargin(title, new Insets(30));

        board.getColumnConstraints().add(new ColumnConstraints(30));
        board.getColumnConstraints().add(new ColumnConstraints(30));
        board.getColumnConstraints().add(new ColumnConstraints(30));
        board.getColumnConstraints().add(new ColumnConstraints(30));
        board.getColumnConstraints().add(new ColumnConstraints(30));
        board.getColumnConstraints().add(new ColumnConstraints(30));
        board.getColumnConstraints().add(new ColumnConstraints(30));
        board.getColumnConstraints().add(new ColumnConstraints(30));
        board.getColumnConstraints().add(new ColumnConstraints(30));
        board.getRowConstraints().add(new RowConstraints(30));
        board.getRowConstraints().add(new RowConstraints(30));
        board.getRowConstraints().add(new RowConstraints(30));
        board.getRowConstraints().add(new RowConstraints(30));
        board.getRowConstraints().add(new RowConstraints(30));
        board.getRowConstraints().add(new RowConstraints(30));
        board.getRowConstraints().add(new RowConstraints(30));
        board.getRowConstraints().add(new RowConstraints(30));
        board.getRowConstraints().add(new RowConstraints(30));

        this.addToBoard();
        this.addBoardText();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board.setHalignment(textArr[i][j], HPos.CENTER);
            }
        }

        board.setGridLinesVisible(true);
        mainPane.setCenter(board);
        board.setAlignment(TOP_CENTER);

        type.setItems(FXCollections.observableArrayList(Difficulty.values()));
        type.setPromptText("Set Difficulty");
        input.setPromptText("Type number here");
        bottom.getChildren().addAll(type, newBoard, input);
        mainPane.setBottom(bottom);
        mainPane.setMargin(bottom, new Insets(30));
        bottom.setPadding(new Insets(10));
        bottom.setSpacing(10);
        bottom.setAlignment(CENTER);
        notes.setMaxSize(150,200);
        notes.setPromptText("Keep notes here");
        VBox right = new VBox();
        right.getChildren().addAll(notes, hint);
        hint.setAlignment(CENTER);
        right.setSpacing(10);
        mainPane.setMargin(right, new Insets(15));
        mainPane.setRight(right);

        Image picture = new Image("bckgrnd.jpg");
        ImageView view = new ImageView(picture);
        StackPane pane = new StackPane();
        pane.getChildren().add(view);
        pane.getChildren().add(mainPane);
        primaryStage.setScene(new Scene(pane, 500, 500));
        primaryStage.show();

        hint.setOnAction(e -> {
            Random ran = new Random();
            int xVal = ran.nextInt(9);
            int yVal = ran.nextInt(9);
            while (textArr[xVal][yVal].isVisible()) {
                xVal = ran.nextInt(9);
                yVal = ran.nextInt(9);
            }
            textArr[xVal][yVal].setText(String.valueOf(sol.getGrid()[xVal][yVal]));
            textArr[xVal][yVal].setVisible(true);
            tfArray[xVal][yVal] = false;
        });

        newBoard.setOnAction(e -> {
            sol = new Solutions();
            sol.generateAns();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    textArr[i][j].setText(Integer.toString(sol.getGrid()[i][j]));
                    textArr[i][j].setStyle("-fx-font-weight: bold");
                    textArr[i][j].setVisible(false);
                }
            }
            String text = type.getValue() + " ";
            Random ran = new Random();
            if (text.contains("EASY")) {
                boardSetter(ran.nextInt(8) + 34);
            } else if (text.contains("MEDIUM")) {
                boardSetter(ran.nextInt(8) + 26);
            } else if (text.contains("HARD")) {
                boardSetter(ran.nextInt(5) + 21);
            }
        });

        rect00.setOnMouseClicked(e -> {
            actionHelper(0, 0, textArr);
        });

        rect01.setOnMouseClicked(e -> {
            actionHelper(1, 0, textArr);
        });

        rect02.setOnMouseClicked(e -> {
            actionHelper(2, 0, textArr);
        });

        rect03.setOnMouseClicked(e -> {
            actionHelper(3, 0, textArr);
        });

        rect04.setOnMouseClicked(e -> {
            actionHelper(4, 0, textArr);
        });

        rect05.setOnMouseClicked(e -> {
            actionHelper(5, 0, textArr);
        });

        rect06.setOnMouseClicked(e -> {
            actionHelper(6, 0, textArr);
        });

        rect07.setOnMouseClicked(e -> {
            actionHelper(7, 0, textArr);
        });

        rect08.setOnMouseClicked(e -> {
            actionHelper(8, 0, textArr);
        });

        rect10.setOnMouseClicked(e -> {
            actionHelper(0, 1, textArr);
        });

        rect11.setOnMouseClicked(e -> {
            actionHelper(1, 1, textArr);
        });

        rect12.setOnMouseClicked(e -> {
            actionHelper(2, 1, textArr);
        });

        rect13.setOnMouseClicked(e -> {
            actionHelper(3, 1, textArr);
        });

        rect14.setOnMouseClicked(e -> {
            actionHelper(4, 1, textArr);
        });

        rect15.setOnMouseClicked(e -> {
            actionHelper(5, 1, textArr);
        });

        rect16.setOnMouseClicked(e -> {
            actionHelper(6, 1, textArr);
        });

        rect17.setOnMouseClicked(e -> {
            actionHelper(7, 1, textArr);
        });

        rect18.setOnMouseClicked(e -> {
            actionHelper(8, 1, textArr);
        });

        rect20.setOnMouseClicked(e -> {
            actionHelper(0, 2, textArr);
        });

        rect21.setOnMouseClicked(e -> {
            actionHelper(1, 2, textArr);
        });

        rect22.setOnMouseClicked(e -> {
            actionHelper(2, 2, textArr);
        });

        rect23.setOnMouseClicked(e -> {
            actionHelper(3, 2, textArr);
        });

        rect24.setOnMouseClicked(e -> {
            actionHelper(4, 2, textArr);
        });

        rect25.setOnMouseClicked(e -> {
            actionHelper(5, 2, textArr);
        });

        rect26.setOnMouseClicked(e -> {
            actionHelper(6, 2, textArr);
        });

        rect27.setOnMouseClicked(e -> {
            actionHelper(7, 2, textArr);
        });

        rect28.setOnMouseClicked(e -> {
            actionHelper(8, 2, textArr);
        });

        rect30.setOnMouseClicked(e -> {
            actionHelper(0, 3, textArr);
        });

        rect31.setOnMouseClicked(e -> {
            actionHelper(1, 3, textArr);
        });

        rect32.setOnMouseClicked(e -> {
            actionHelper(2, 3, textArr);
        });

        rect33.setOnMouseClicked(e -> {
            actionHelper(3, 3, textArr);
        });

        rect34.setOnMouseClicked(e -> {
            actionHelper(4, 3, textArr);
        });

        rect35.setOnMouseClicked(e -> {
            actionHelper(5, 3, textArr);
        });

        rect36.setOnMouseClicked(e -> {
            actionHelper(6, 3, textArr);
        });

        rect37.setOnMouseClicked(e -> {
            actionHelper(7, 3, textArr);
        });

        rect38.setOnMouseClicked(e -> {
            actionHelper(8, 3, textArr);
        });

        rect40.setOnMouseClicked(e -> {
            actionHelper(0, 4, textArr);
        });

        rect41.setOnMouseClicked(e -> {
            actionHelper(1, 4, textArr);
        });

        rect42.setOnMouseClicked(e -> {
            actionHelper(2, 4, textArr);
        });

        rect43.setOnMouseClicked(e -> {
            actionHelper(3, 4, textArr);
        });

        rect44.setOnMouseClicked(e -> {
            actionHelper(4, 4, textArr);
        });

        rect45.setOnMouseClicked(e -> {
            actionHelper(5, 4, textArr);
        });

        rect46.setOnMouseClicked(e -> {
            actionHelper(6, 4, textArr);
        });

        rect47.setOnMouseClicked(e -> {
            actionHelper(7, 4, textArr);
        });

        rect48.setOnMouseClicked(e -> {
            actionHelper(8, 4, textArr);
        });

        rect50.setOnMouseClicked(e -> {
            actionHelper(0, 5, textArr);
        });

        rect51.setOnMouseClicked(e -> {
            actionHelper(1, 5, textArr);
        });

        rect52.setOnMouseClicked(e -> {
            actionHelper(2, 5, textArr);
        });

        rect53.setOnMouseClicked(e -> {
            actionHelper(3, 5, textArr);
        });

        rect54.setOnMouseClicked(e -> {
            actionHelper(4, 5, textArr);
        });

        rect55.setOnMouseClicked(e -> {
            actionHelper(5, 5, textArr);
        });

        rect56.setOnMouseClicked(e -> {
            actionHelper(6, 5, textArr);
        });

        rect57.setOnMouseClicked(e -> {
            actionHelper(7, 5, textArr);
        });

        rect58.setOnMouseClicked(e -> {
            actionHelper(8, 5, textArr);
        });

        rect60.setOnMouseClicked(e -> {
            actionHelper(0, 6, textArr);
        });

        rect61.setOnMouseClicked(e -> {
            actionHelper(1, 6, textArr);
        });

        rect62.setOnMouseClicked(e -> {
            actionHelper(2, 6, textArr);
        });

        rect63.setOnMouseClicked(e -> {
            actionHelper(3, 6, textArr);
        });

        rect64.setOnMouseClicked(e -> {
            actionHelper(4, 6, textArr);
        });

        rect65.setOnMouseClicked(e -> {
            actionHelper(5, 6, textArr);
        });

        rect66.setOnMouseClicked(e -> {
            actionHelper(6, 6, textArr);
        });

        rect67.setOnMouseClicked(e -> {
            actionHelper(7, 6, textArr);
        });

        rect68.setOnMouseClicked(e -> {
            actionHelper(8, 6, textArr);
        });

        rect70.setOnMouseClicked(e -> {
            actionHelper(0, 7, textArr);
        });

        rect71.setOnMouseClicked(e -> {
            actionHelper(1, 7, textArr);
        });

        rect72.setOnMouseClicked(e -> {
            actionHelper(2, 7, textArr);
        });

        rect73.setOnMouseClicked(e -> {
            actionHelper(3, 7, textArr);
        });

        rect74.setOnMouseClicked(e -> {
            actionHelper(4, 7, textArr);
        });

        rect75.setOnMouseClicked(e -> {
            actionHelper(5, 7, textArr);
        });

        rect76.setOnMouseClicked(e -> {
            actionHelper(6, 7, textArr);
        });

        rect77.setOnMouseClicked(e -> {
            actionHelper(7, 7, textArr);
        });

        rect78.setOnMouseClicked(e -> {
            actionHelper(8, 7, textArr);
        });

        rect80.setOnMouseClicked(e -> {
            actionHelper(0, 8, textArr);
        });

        rect81.setOnMouseClicked(e -> {
            actionHelper(1, 8, textArr);
        });

        rect82.setOnMouseClicked(e -> {
            actionHelper(2, 8, textArr);
        });

        rect83.setOnMouseClicked(e -> {
            actionHelper(3, 8, textArr);
        });

        rect84.setOnMouseClicked(e -> {
            actionHelper(4, 8, textArr);
        });

        rect85.setOnMouseClicked(e -> {
            actionHelper(5, 8, textArr);
        });

        rect86.setOnMouseClicked(e -> {
            actionHelper(6, 8, textArr);
        });

        rect87.setOnMouseClicked(e -> {
            actionHelper(7, 8, textArr);
        });

        rect88.setOnMouseClicked(e -> {
            actionHelper(8, 8, textArr);
        });
    }

    public void addToBoard() {
        rect00.setFill(Color.TAN);
        rect01.setFill(Color.TAN);
        rect02.setFill(Color.TAN);
        rect10.setFill(Color.TAN);
        rect11.setFill(Color.TAN);
        rect12.setFill(Color.TAN);
        rect20.setFill(Color.TAN);
        rect21.setFill(Color.TAN);
        rect22.setFill(Color.TAN);
        rect06.setFill(Color.TAN);
        rect07.setFill(Color.TAN);
        rect08.setFill(Color.TAN);
        rect06.setFill(Color.TAN);
        rect07.setFill(Color.TAN);
        rect08.setFill(Color.TAN);
        rect16.setFill(Color.TAN);
        rect17.setFill(Color.TAN);
        rect18.setFill(Color.TAN);
        rect26.setFill(Color.TAN);
        rect27.setFill(Color.TAN);
        rect28.setFill(Color.TAN);
        rect33.setFill(Color.TAN);
        rect34.setFill(Color.TAN);
        rect35.setFill(Color.TAN);
        rect43.setFill(Color.TAN);
        rect44.setFill(Color.TAN);
        rect45.setFill(Color.TAN);
        rect53.setFill(Color.TAN);
        rect54.setFill(Color.TAN);
        rect55.setFill(Color.TAN);
        rect60.setFill(Color.TAN);
        rect61.setFill(Color.TAN);
        rect62.setFill(Color.TAN);
        rect70.setFill(Color.TAN);
        rect71.setFill(Color.TAN);
        rect72.setFill(Color.TAN);
        rect80.setFill(Color.TAN);
        rect81.setFill(Color.TAN);
        rect82.setFill(Color.TAN);
        rect66.setFill(Color.TAN);
        rect67.setFill(Color.TAN);
        rect68.setFill(Color.TAN);
        rect76.setFill(Color.TAN);
        rect77.setFill(Color.TAN);
        rect78.setFill(Color.TAN);
        rect86.setFill(Color.TAN);
        rect87.setFill(Color.TAN);
        rect88.setFill(Color.TAN);
        rect30.setFill(Color.PEACHPUFF);
        rect31.setFill(Color.PEACHPUFF);
        rect32.setFill(Color.PEACHPUFF);
        rect40.setFill(Color.PEACHPUFF);
        rect41.setFill(Color.PEACHPUFF);
        rect42.setFill(Color.PEACHPUFF);
        rect50.setFill(Color.PEACHPUFF);
        rect51.setFill(Color.PEACHPUFF);
        rect52.setFill(Color.PEACHPUFF);
        rect03.setFill(Color.PEACHPUFF);
        rect04.setFill(Color.PEACHPUFF);
        rect05.setFill(Color.PEACHPUFF);
        rect13.setFill(Color.PEACHPUFF);
        rect14.setFill(Color.PEACHPUFF);
        rect15.setFill(Color.PEACHPUFF);
        rect23.setFill(Color.PEACHPUFF);
        rect24.setFill(Color.PEACHPUFF);
        rect25.setFill(Color.PEACHPUFF);
        rect63.setFill(Color.PEACHPUFF);
        rect64.setFill(Color.PEACHPUFF);
        rect65.setFill(Color.PEACHPUFF);
        rect73.setFill(Color.PEACHPUFF);
        rect74.setFill(Color.PEACHPUFF);
        rect75.setFill(Color.PEACHPUFF);
        rect83.setFill(Color.PEACHPUFF);
        rect84.setFill(Color.PEACHPUFF);
        rect85.setFill(Color.PEACHPUFF);
        rect36.setFill(Color.PEACHPUFF);
        rect37.setFill(Color.PEACHPUFF);
        rect38.setFill(Color.PEACHPUFF);
        rect46.setFill(Color.PEACHPUFF);
        rect47.setFill(Color.PEACHPUFF);
        rect48.setFill(Color.PEACHPUFF);
        rect56.setFill(Color.PEACHPUFF);
        rect57.setFill(Color.PEACHPUFF);
        rect58.setFill(Color.PEACHPUFF);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board.add(rectArr[i][j], j, i);
            }
        }
    }

    public void addBoardText() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board.add(textArr[i][j], j, i);
            }
        }
    }

    public Text[] rowColumnText(Text text1, Text text2, Text text3, Text text4, Text text5, Text text6, Text text7, Text text8, Text text9) {
        return new Text[]{text1, text2, text3, text4, text5, text6, text7, text8, text9};
    }

    public Text[][] squareText(Text text1, Text text2, Text text3, Text text4, Text text5, Text text6, Text text7, Text text8, Text text9) {
        return new Text[][]{{text1, text2, text3}, {text4, text5, text6}, {text7, text8, text9}};
    }

    public void boardSetter(int k) {
        int counter = 0;
        Random ran = new Random();
        while (counter <= k) {
            int i = ran.nextInt(8);
            int j = ran.nextInt(8);
            if (!textArr[i][j].isVisible()) {
                textArr[i][j].setVisible(true);
                counter = counter + 1;
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!textArr[i][j].isVisible()) {
                    tfArray[i][j] = true;
                    textArr[i][j].setText("0");
                } else {
                    tfArray[i][j] = false;
                }
            }
        }
    }

    public void actionHelper(int i, int j, Text[][] array) {
        int check = 0;
        if (tfArray[i][j] && isNumeric(input.getText()) && Integer.parseInt(input.getText()) > 0 && Integer.parseInt(input.getText()) < 10) {
            array[i][j].setText(input.getText());
            array[i][j].setStyle("-fx-font-weight: normal");
            if (!array[i][j].isVisible()) {
                array[i][j].setVisible(true);
            }
        }
        input.clear();
        for (int q = 0; q < 9; q++) {
            for (int p = 0; p < 9; p++) {
                if (Integer.parseInt(array[q][p].getText()) == sol.getGrid()[q][p]) {
                    check = 1;
                } else {
                    check = -1;
                    break;
                }
            }
            if (check < 0) {
                break;
            }
        }
        Alert youWon = new Alert(Alert.AlertType.CONFIRMATION, "Congratulations! You've won!");
        if (check > 0) {
            youWon.show();
        }
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}


