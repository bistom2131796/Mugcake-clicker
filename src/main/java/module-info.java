module com.example.mugcake_clicker {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.mugcake_clicker to javafx.fxml;
    exports com.example.mugcake_clicker;
}