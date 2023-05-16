package multi;

public class Mock2VO {
	private String drug_brand;
	private String drug_name;
	private String code;
	private String company;
	
	public String getDrug_brand() {
		return drug_brand;
	}
	public void setDrug_brand(String drug_brand) {
		this.drug_brand = drug_brand;
	}
	public String getDrug_name() {
		return drug_name;
	}
	public void setDrug_name(String drug_name) {
		this.drug_name = drug_name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Mock2VO [drug_brand=" + drug_brand + ", drug_name=" + drug_name + ", code=" + code + ", company="
				+ company + "]";
	}
	
}
