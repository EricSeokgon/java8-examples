package tk.hadeslee.examples.functionalinterface;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by redfo on 2015-10-06.
 */
public class FunctionalInterfaceExamples {
    public static void main(String[] args) {

    }
}

class Product {
    private Long id;
    private String name;
    private BigDecimal price;

    public Product() {
    }

    public Product(Long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringBuilder("Product{")
                .append("id=").append(id)
                .append(", name='").append(name).append('\'')
                .append(", price=").append(price)
                .append('}').toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getId(), product.getId()) &&
                Objects.equals(getName(), product.getName()) &&
                Objects.equals(getPrice(), product.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPrice());
    }
}