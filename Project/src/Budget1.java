import java.util.Calendar;
import java.util.Date;


public class Budget1 {
	private int day;
	private int month;
	private int year;
	private String expense;
	private double price;
	
	public Budget1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Budget1(int day, int month, int year, String expense, double price) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.expense = expense;
		this.price = price;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if (day < 1 || day > 31) {
			return;
		}
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			return;
		}
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (year < 0) {
			return;
		}
		this.year = year;
	}
	public String getExpense() {
		return expense;
	}
	public void setExpense(String expense) {
		this.expense = expense;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price < 0) {
			return;
		}
		this.price = price;
	}
	
	public Date getDate() {
		Calendar c = Calendar.getInstance();
		c.set(getYear(), getMonth() - 1, getDay());
		Date date = c.getTime();
		return date;
	}

}
