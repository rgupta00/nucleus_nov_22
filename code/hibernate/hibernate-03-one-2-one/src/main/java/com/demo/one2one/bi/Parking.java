package com.demo.one2one.bi;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "p_table_bi")
@Data
@NoArgsConstructor
public class Parking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int partingId;
	private String parkingLocation;

	@JoinColumn(name = "empId_fk", unique = true)
//	@OneToOne(cascade = {CascadeType.DETACH, CascadeType.PERSIST}, fetch = FetchType.EAGER)
	@OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	private Employee employee;

	public Parking(String parkingLocation) {
		this.parkingLocation = parkingLocation;
	}
}
