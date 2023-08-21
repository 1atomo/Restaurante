package Classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private String name;
	private String email;
	private Date DatadeAniversario;
	
	private static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
	
	public Cliente() {
	
	}


	public Cliente(String name, String email, Date datadeAniversario) {
		this.name = name;
		this.email = email;
		DatadeAniversario = datadeAniversario;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDatadeAniversario() {
		return DatadeAniversario;
	}


	public void setDatadeAniversario(Date datadeAniversario) {
		DatadeAniversario = datadeAniversario;
	}



	public String toString() {
		return name + " (" +formatoData.format(DatadeAniversario)+  ") -  " + email;
	}
	
	
	
	
	
	
}
