package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Persona {

    @JsonProperty("active")
    private boolean active;
    @JsonProperty("id")
    private int id;
    @JsonProperty("age")
    private int age;
    @JsonProperty("eyeColor")
    private String eyeColor;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("genero")
    private String genero;
    @JsonProperty("registered")
    private String registered;
    @JsonProperty("latitude")
    private double latitude;
    @JsonProperty("longitude")
    private double longitude;

    @JsonProperty("tags")
    private List<String> tags;

    @JsonProperty("book")
    private List<Libro> books;

    public Persona() {
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Libro> getBooks() {
        return books;
    }

    public void setBooks(List<Libro> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "active=" + active +
                ", id=" + id +
                ", age=" + age +
                ", eyeColor='" + eyeColor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", registered='" + registered + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", tags=" + tags +
                ", books=" + books +
                '}';
    }
}
