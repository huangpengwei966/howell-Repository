package org.javaboy.JdbcTemplate;

public class User1 {
    private Integer id;
    private String username;
    //private String name;
    private String address;

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                //", username='" + name + '\'' +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
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
