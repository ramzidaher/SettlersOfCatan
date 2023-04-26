module com.settlers.demotesty {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.settlers.demotesty to javafx.fxml;
    exports com.settlers.demotesty;
    exports com.settlers.demotesty.Controllers;
    opens com.settlers.demotesty.Controllers to javafx.fxml;
}