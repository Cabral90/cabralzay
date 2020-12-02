module es.cabralzay.com {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.cabralzay.com to javafx.fxml;
    exports es.cabralzay.com;
}