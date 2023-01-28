package work.sonum.sonumsararycalculate.model;


import java.util.Objects;

public class WallpaperWork  {
    private String name;
    private double price;
    private TypeOfWork type;

    public WallpaperWork(String name, double price , TypeOfWork type) {
        setName(name);
        setPrice(price);
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Имя не должно быть пустым");
        }

    }

    public TypeOfWork getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallpaperWork that = (WallpaperWork) o;
        return Double.compare(that.price, price) == 0 && Objects.equals(name, that.name) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, type);
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Стоимость услуги не может быть меньше 0");
        }


    }
}
