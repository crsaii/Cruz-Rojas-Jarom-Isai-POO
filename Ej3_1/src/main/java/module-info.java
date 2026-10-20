module com.mycompany.ej3_1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ej3_1 to javafx.fxml;
    exports com.mycompany.ej3_1;
}
