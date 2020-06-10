package git.dao;

public class UserDao {
	private int id;
	private String username;
	private String password;
	private int sex;
	private String love;
	
	
	public UserDao(int id,String username,String password,String love) {
		super();
		this.id=id;
		this.username=username;
		this.password=password;
		this.sex=sex;
		this.love=love;
	}
}
