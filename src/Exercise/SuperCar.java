package Exercise;

public class SuperCar {
    private String car_brand;
    private String car_color;
    private int car_engine_size;
    private String max_speed;
    private String country_of_origin;
    //consttrutor

    public SuperCar(String car_brand, String car_color, int car_engine_size,String  max_speed, String country_of_origin) {
        this.car_brand = car_brand;
        this.car_color = car_color;
        this.car_engine_size = car_engine_size;
        this.max_speed = max_speed;
        this.country_of_origin = country_of_origin;
    }

    //getter and setter

    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public String getCar_color() {
        return car_color;
    }

    public void setCar_color(String car_color) {
        this.car_color = car_color;
    }

    public int getCar_engine_size() {
        return car_engine_size;
    }

    public void setCar_engine_size(int car_engine_size) {
        this.car_engine_size = car_engine_size;
    }

    public String getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(String max_speed) {
        this.max_speed = max_speed;
    }

    public String getCountry_of_origin() {
        return country_of_origin;
    }

    public void setCountry_of_origin(String country_of_origin) {
        this.country_of_origin = country_of_origin;
    }


    //toString


    @Override
    public String toString() {
        return "SuperCar{" +
                "car_brand='" + car_brand + '\'' +
                ", car_color='" + car_color + '\'' +
                ", car_engine_size=" + car_engine_size +
                ", max_speed=" + max_speed +
                ", country_of_origin='" + country_of_origin + '\'' +
                '}';
    }
}