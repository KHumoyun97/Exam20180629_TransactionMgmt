package transactions;
import java.util.*;

//import static java.util.stream.Collectors.*;
//import static java.util.Comparator.*;

public class TransactionManager {
	
//R1
	Set<Region> regions=new HashSet<>();
	Set<Place > places=new HashSet<>();

	Map<String ,Carrier> carriersMap=new HashMap<>();

	public List<String> addRegion(String regionName, String... placeNames) {
		Region region=new Region(regionName);
		regions.add(region);
		for (String placeName : placeNames) {
			Place place = new Place(placeName);
			if (!places.contains(place)) {
				region.addPlace(place);
			}
			places.add(place);
		}
		List<Place> regionPlaces= region.getPlaces();
		regionPlaces.sort(Comparator.comparing(Place::getName));

		List<String> regionNames=new ArrayList<>(regionPlaces.size());
		for (Place regionPlace : regionPlaces) {
			regionNames.add(regionPlace.getName());
		}
		return regionNames;
	}

	public List<String> addCarrier(String carrierName, String... regionNames) {
		Carrier.add(carrierName);
		Set<String> carrierRegion=new TreeSet<>();
		for (String regionName : regionNames) {
			if (regions.contains(regionName)) carrierRegion.add(regionName);

			
		}
		return new ArrayList<String>(carrierRegion);
	}
	
	public List<String> getCarriersForRegion(String regionName) { 
		return new ArrayList<String>();
	}
	
//R2
	public void addRequest(String requestId, String placeName, String productId) 
			throws TMException {
	}
	
	public void addOffer(String offerId, String placeName, String productId) 
			throws TMException {
	}
	

//R3
	public void addTransaction(String transactionId, String carrierName, String requestId, String offerId) 
			throws TMException {
	}
	
	public boolean evaluateTransaction(String transactionId, int score) {
		return false;
	}
	
//R4
	public SortedMap<Long, List<String>> deliveryRegionsPerNT() {
		return new TreeMap<Long, List<String>>();
	}
	
	public SortedMap<String, Integer> scorePerCarrier(int minimumScore) {
		return new TreeMap<String, Integer>();
	}
	
	public SortedMap<String, Long> nTPerProduct() {
		return new TreeMap<String, Long>();
	}
	
	
}

