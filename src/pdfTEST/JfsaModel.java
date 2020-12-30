package pdfTEST;

public class JfsaModel {
	private String name;
	private String address;
	private String phone;
	private String website;
	private String issueDate;
	private String country;
	private String url;
	public JfsaModel(String name, String address, String phone, String website, String issueDate, String country,
			String url) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.website = website;
		this.issueDate = issueDate;
		this.country = country;
		this.url = url;
	}
	public JfsaModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

}
