module com.mgmt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mgmt to javafx.fxml;
    exports com.mgmt;
}