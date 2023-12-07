module com.example.lv6final {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.scripting;


    opens com.example.lv6final to javafx.fxml;
    exports com.example.lv6final;
}