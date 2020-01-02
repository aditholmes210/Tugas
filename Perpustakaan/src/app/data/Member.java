package app.data;

public class Member{ //abstract class tidak bisa dibuat objectnya
	private int ID;
	private String Name;
	private String Gender;
	private String Address;
	
	public Member(int id, String name, String gender, String address){ 
		this.ID = id;
		this.Name = name;
		this.Gender = gender;
		this.Address = address;
	}
	
	public int getID(){
		return ID;
	}
	public void setID(int id){
		this.ID = id;
	}
	
	public String getName(){
		return Name;
	}
	public void setName(String name){
		this.Name = name;
	}
	
	public String getGender(){
		return Gender;
	}
	public void setGender(String gender){
		this.Gender = gender;
	}
	
	public String getAddress(){
		return Address;
	}
	public void setAddress(String address){
		this.Address = address;
	}
}