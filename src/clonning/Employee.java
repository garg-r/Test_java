package clonning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Employee 

//implements Cloneable
{

	private int id;
	private String name;
	private Map<String,String> props;
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
	public Map<String, String> getProps() {
		return props;
	}
	public void setProps(Map<String, String> props) {
		this.props = props;
	}
	
	/*@Override
	 public Object clone() throws CloneNotSupportedException {
		//shallow clonning
	 return super.clone();
		
		//deep clonning
		
			Object obj = super.clone(); //utilize clone Object method

			Employee emp = (Employee) obj;

			// deep cloning for immutable fields
			emp.setProps(null);
			Map<String, String> hm = new HashMap<>();
			String key;
			Iterator<String> it = this.props.keySet().iterator();
			// Deep Copy of field by field
			while (it.hasNext()) {
				key = it.next();
				hm.put(key, this.props.get(key));
			}
			emp.setProps(hm);
			
			return emp;
	 }*/
	public Employee(Employee emp) {
		this.setId(emp.getId());
		this.setName(emp.getName());
		
		Map<String, String> hm = new HashMap<>();
		String key;
		Iterator<String> it = emp.getProps().keySet().iterator();
		// Deep Copy of field by field
		while (it.hasNext()) {
			key = it.next();
			hm.put(key, emp.getProps().get(key));
		}
		this.setProps(hm);
	}
	
	public Employee() {
	}
}
