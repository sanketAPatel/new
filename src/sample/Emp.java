package sample;

public class Emp {  
private int id;  
public Emp(int id, String name, String password, String email, String country) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
	this.email = email;
	this.country = country;
}
private String name,password,email,country;  

public Emp(String name, String password, String email, String country) {
	super();
	this.name = name;
	this.password = password;
	this.email = email;
	this.country = country;
}
public Emp() {
	// TODO Auto-generated constructor stub
}
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getPassword() {  
    return password;  
}  
public void setPassword(String password) {  
    this.password = password;  
}  
public String getEmail() {  
    return email;  
}  
public void setEmail(String email) {  
    this.email = email;  
}  
public String getCountry() {  
    return country;  
}  
public void setCountry(String country) {  
    this.country = country;  
}  
  
}  