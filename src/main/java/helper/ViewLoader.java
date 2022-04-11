package helper;

import controller.BaseController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class ViewLoader {


    public static Parent load(String fxmlName, BaseController controller) {

        var url = ViewLoader.class.getResource(String.format("/fxml/%s.fxml", fxmlName));

        Parent parent = null;

        try {
            FXMLLoader loader = new FXMLLoader();

            if (controller != null)
                loader.setController(controller);

            loader.setLocation(url);
            parent = loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return parent;
    }

}
