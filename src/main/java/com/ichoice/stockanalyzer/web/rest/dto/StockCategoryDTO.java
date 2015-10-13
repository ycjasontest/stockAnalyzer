package com.ichoice.stockanalyzer.web.rest.dto;

import java.io.Serializable;
import java.util.Objects;


/**
 * A DTO for the StockCategory entity.
 */
public class StockCategoryDTO implements Serializable {

    private Long id;

    private String name;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        StockCategoryDTO stockCategoryDTO = (StockCategoryDTO) o;

        if ( ! Objects.equals(id, stockCategoryDTO.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "StockCategoryDTO{" +
                "id=" + id +
                ", name='" + name + "'" +
                '}';
    }
}
