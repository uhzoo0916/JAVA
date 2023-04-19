package day14_videoquiz;


import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Video { 
	private String title, category, name;
	private Boolean lend;
	private Date date;
	
	//1. 생성자 함수 
	public Video(String title, String category, Boolean lend, String name) {
		super();
		this.title = title;
		this.category = category;
		this.name = name;
		this.lend = lend;
		Calendar calendar = Calendar.getInstance();
		this.date = date;
	}
	



	//getter and setter 
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Boolean getLend() {
		return lend;
	}



	public void setLend(Boolean lend) {
		this.lend = lend;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	@Override
		public String toString() {
				return "Video [title=" + title + ", category=" + category + ", 	"
						      + "lend=" + lend + ", name=" + name +", date=" + date  + "]";
	}
}
	

