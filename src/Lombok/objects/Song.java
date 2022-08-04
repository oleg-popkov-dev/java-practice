package Lombok.objects;


import Lombok.interfaces.ISong;

public class Song implements ISong {

    public Song() {
    }

    public Song(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    private String name;
    private Author author;


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public void play() {
        System.out.println(String.format("Play song: %s, author %s.", name, author.getName()));
    }
}