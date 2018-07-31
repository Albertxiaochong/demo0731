package com.example.demo0731.dao.model;

import java.io.Serializable;
import javax.persistence.*;

public class City implements Serializable {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "CountryCode")
    private String countrycode;

    @Column(name = "District")
    private String district;

    @Column(name = "Population")
    private Integer population;

    private static final long serialVersionUID = 1L;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return CountryCode
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * @param countrycode
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    /**
     * @return District
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * @return Population
     */
    public Integer getPopulation() {
        return population;
    }

    /**
     * @param population
     */
    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", countrycode=").append(countrycode);
        sb.append(", district=").append(district);
        sb.append(", population=").append(population);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}