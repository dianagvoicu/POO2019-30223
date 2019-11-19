package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;

public abstract class Employee {
	protected String name;
	protected Long id;
	protected BigDecimal salary;
	protected Boolean isDead = false;
	
	public Employee(String name,BigDecimal salary) {
		this.name = name;
		this.id = (long) Math.floor(Math.random() * 9_000_000_000_000L) + 1_000_000_000_000L;
		this.salary = salary;
	}
	
	public Long getId(){
		return this.id;
	}
	
	public void setId(Long id){
		this.id=id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getSalary() {
		return this.salary;
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary=salary;
	}
	
	public Boolean getIfIsDead() {
		return this.isDead;
	}
	
	public void setIfIsDead(Boolean isDead) {
		this.isDead = isDead;
	}
}
