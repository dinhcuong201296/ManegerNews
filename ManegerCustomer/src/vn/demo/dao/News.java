package vn.demo.dao;

public class News {

	private int id;
	private int category_id;
	private String name;
	private String description;
	private String details;
	private String image;
	private String timestamp;
	private int userId;
	public News(int id, int category_id, String name, String description, String details, String image,
			String timestamp, int userId) {
		super();
		this.id = id;
		this.category_id = category_id;
		this.name = name;
		this.description = description;
		this.details = details;
		this.image = image;
		this.timestamp = timestamp;
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "values(" + id + ", " + category_id + ",' " + name + "','" + description
				+ "',' " + details + "',' " + image + "',' " + timestamp + "', " + userId +")";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setDate(String string) {
		// TODO Auto-generated method stub
		
	}

	public int getDate() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
