package transactions;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private String name;

    private List<Place> places=new ArrayList<>();

    public Region(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Place> getPlaces() {
        this.places = places;
        return null;
    }

    public void  addPlace(Place place){
     places.add(place);
     }

}
