module com.mycompany.ej1_4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ej1_4 to javafx.fxml;
    exports com.mycompany.ej1_4;
}
