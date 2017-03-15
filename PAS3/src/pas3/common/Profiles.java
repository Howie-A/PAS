package pas3.common;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import javax.imageio.ImageIO;

public class Profiles {
	private String name;
	private String year;
	private int age;
	private boolean onCampus;
	private String gender;
	
	//private <something> profpic
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public boolean isOnCampus() {
		return onCampus;
	}
	public void setOnCampus(boolean onCampus) {
		this.onCampus = onCampus;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
