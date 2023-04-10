package Company;

public class workers {
	//Code smell
	private String name;
	private int salary;
	
	public workers(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}

	public void PrintWorkerDetails(){
		System.out.println(name + "'s salary is : " + String.valueOf(salary));
	}
}
