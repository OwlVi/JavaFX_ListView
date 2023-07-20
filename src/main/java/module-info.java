module ku.cs.listview {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens ku.cs.listview to javafx.fxml;
    exports ku.cs.listview;
    exports ku.cs.controllers;
    opens ku.cs.controllers to javafx.fxml;
}