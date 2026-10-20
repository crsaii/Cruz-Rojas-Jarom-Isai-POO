module com.mycompany.ej3_2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ej3_2 to javafx.fxml;
    exports com.mycompany.ej3_2;
}
