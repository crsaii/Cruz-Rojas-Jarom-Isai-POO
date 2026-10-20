module com.mycompany.ej1_5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ej1_5 to javafx.fxml;
    exports com.mycompany.ej1_5;
}
