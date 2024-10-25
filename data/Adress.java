package data;
//haut hie
public class Adress {

    private String cityName;
    private String postCode;
    private String streetName;
    private String houseNumber;

    public Adress(String cityName, String postCode, String streetName, String houseNumber) {
        this.cityName = cityName;
        this.postCode = postCode;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public Adress editAdress(String cityName, String postCode, String streetName, String houseNumber) {
        if (cityName != null) {
            this.cityName = cityName;
        }
        if (postCode != null) {
            this.postCode = postCode;
        }
        if (streetName != null) {
            this.streetName = streetName;
        }
        if (houseNumber != null) {
            this.houseNumber = houseNumber;
        }
        return this;
    }
}