package org.javaboy.others;

import org.javaboy.Cat;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class User {
    private Integer id;
    private String name;
    private Integer age;
    /*public void doSth() {
        Book book = new Book();
        book.setId(1);
        book.setName("故事新编");
        book.setPrice((double) 20);
    }*/
    private Cat cat;
    private List<Cat> cats;
    private String[] favorites;
    private Map<String,String> map;
    private Properties info;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", cat=" + cat +
                ", favorites=" + Arrays.toString(favorites) +
                ", cats=" + cats +
                ", map=" + map +
                ", info=" + info +
                '}';
    }

    public User() {
    }

    public User(Integer id, String name, Integer age, Cat cat) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public List<Cat> getCats() {
        return cats;
    }
    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    public String[] getFavorites() {
        return favorites;
    }
    public void setFavorites(String[] favorites) {
        this.favorites = favorites;
    }

    public Map<String, String> getMap() {
        return map;
    }
    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public Properties getInfo() {
        return info;
    }
    public void setInfo(Properties info) {
        this.info = info;
    }
}
