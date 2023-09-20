package com.satyam.springcloud.dto;

import java.math.BigDecimal;
import java.util.Objects;

public final class Price {
    private final Long id;
    private final String code;
    private final String description;
    private final BigDecimal price;

    Price(Long id, String code, String description, BigDecimal price) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public Long id() {
        return id;
    }

    public String code() {
        return code;
    }

    public String description() {
        return description;
    }

    public BigDecimal price() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Price that = (Price) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.code, that.code) &&
                Objects.equals(this.description, that.description) &&
                Objects.equals(this.price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, description, price);
    }

    @Override
    public String toString() {
        return "Price[" +
                "id=" + id + ", " +
                "code=" + code + ", " +
                "description=" + description + ", " +
                "price=" + price + ']';
    }
}
