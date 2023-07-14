module com.idsglobal.edhassistant {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.idsglobal.edhassistant to javafx.fxml;
    exports com.idsglobal.edhassistant;
}