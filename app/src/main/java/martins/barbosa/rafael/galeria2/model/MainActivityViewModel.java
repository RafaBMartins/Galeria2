package martins.barbosa.rafael.galeria2.model;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends ViewModel {

    List<String> photos = new ArrayList<>();

    public List<String> getPhotos() {
        return photos;
    }
}
