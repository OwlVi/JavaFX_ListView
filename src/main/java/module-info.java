module ku.cs    {
    requires javafx.controls;
    requires javafx.fxml;

    exports ku.cs.models;
    opens ku.cs.models to javafx.base;
                            
    opens ku.cs.lab03listview to javafx.fxml;
    exports ku.cs.lab03listview;
    exports ku.cs.controllers;
    opens ku.cs.controllers to javafx.fxml;
    exports ku.cs;
    opens ku.cs to javafx.fxml;
}