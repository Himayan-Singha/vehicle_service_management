package com.capgemini.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ServiceRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
	public int service_Req_No;
	public int service_Id;
=======
	public int service_Id;
	public int service_Req_No;
>>>>>>> 36c1a3f86a1899d2a153a474748c80a151e1f41e
	public int vehicle_Reg_No;
	public String date;
	public double price;
	public String status;
	public int mechanics_Id;
	
	@Column(nullable = false)
	public boolean is_deleted = false;
	public String create_Date_Time;
	public String update_Date_Time;
	
<<<<<<< HEAD

=======
>>>>>>> 36c1a3f86a1899d2a153a474748c80a151e1f41e
}
