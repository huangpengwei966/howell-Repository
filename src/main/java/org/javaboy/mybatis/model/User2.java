package org.javaboy.mybatis.model;

import java.util.List;

public class User2 {
    private Integer id;
    private String username;
    //private String name;
    private String address;
    private List<String> favorites;

    public List<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }

    @Override
    public String toString() {
        return "User2{" +
                "id=" + id +
                //", username='" + name + '\'' +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", favorites=" + favorites +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
