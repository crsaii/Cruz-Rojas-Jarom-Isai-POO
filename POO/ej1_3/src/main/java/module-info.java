module com.mycompany.ej1_3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ej1_3 to javafx.fxml;
    exports com.mycompany.ej1_3;
}
