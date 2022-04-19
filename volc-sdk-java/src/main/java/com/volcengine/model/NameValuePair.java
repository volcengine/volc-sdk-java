package com.volcengine.model;

import java.util.Objects;

public class NameValuePair implements Comparable {

    private String name;

    private String value;

    public NameValuePair(String name , String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NameValuePair that = (NameValuePair) o;
        return Objects.equals(name, that.name) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) {
            return 1;
        }
        NameValuePair that = (NameValuePair) o;
        return this.name.compareTo(that.name);
    }
}
