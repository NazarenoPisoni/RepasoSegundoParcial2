package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Libro {
    @JsonProperty("ISBN")
    private int isbn;
    @JsonProperty("author")
    private String author;

    public Libro() {
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return this.isbn == libro.isbn && this.author.equals(libro.author);
    }

    @Override
    public int hashCode(){
        return Objects.hash(isbn, author);
    }
}
