package ObjectOrientedProgramming;

public class Author {
    String name;
    String sex;
    String email;

    public Author(String name, String sex, String email){
        this.name = name;
        this.sex = sex;
        this.email = email;
    }
    Author(){
    }
    public String getName(){
        return name;
    }

    public String getSex(){
        return sex;
    }

    public String getEmail(){
        return email;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
