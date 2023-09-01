module com.mgmt.salesmanagement {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.mgmt.salesmanagement to javafx.fxml;
    exports com.mgmt.salesmanagement;
}