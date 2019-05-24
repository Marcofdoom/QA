package library.item;

public class Map extends Item {

	private String locationMap;

	public Map(String itemName, String locationMap) {
		super(itemName);
		this.locationMap = locationMap;
	}

	public String getLocationMap() {
		return locationMap;
	}
}