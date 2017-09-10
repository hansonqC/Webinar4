package generics;

/**
 * Created by lukasz on 2017-08-05.
 */
public class Car  implements Comparable<Car> {
    private int vin;
    private String brand;

    public Car (int vin, String brand) {
        this.vin = vin;
        this.brand = brand;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin=" + vin +
                ", brand='" + brand + '\'' +
                '}';
    }
  //generujemy po to zeby moc porownac zeby usunac , porownywanie za pomo
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (vin != car.vin) return false;
        return brand != null ? brand.equals(car.brand) : car.brand == null;
    }

    @Override
    public int hashCode() {
        int result = vin;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        return result;
    }



    @Override  //zwraca wartosc ujemna gdy wartosc np vin jest mniejszy od objektu o
    //zwraca wartosc dodatnia gdy jest wiekszy
    //zwraca 0 gdy jest taki sam

    public int compareTo(Car o) {
        int diff=vin-o.getVin();
        return  diff;
    }
}
