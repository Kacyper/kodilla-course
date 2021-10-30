module com.kodilla.kodillagoodpatterns {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kodilla.kodillagoodpatterns to javafx.fxml;
    exports com.kodilla.kodillagoodpatterns;
}