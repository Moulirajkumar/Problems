
public class StudentPojo 
{
	private String name;
	private int id;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	public StudentPojo(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student id=" + this.id+" Student name=" + this.name ;
	}
}
