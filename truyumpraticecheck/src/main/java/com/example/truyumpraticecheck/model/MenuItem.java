package com.example.truyumpraticecheck.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MenuItem {
	@Id
	@Column(name="me_id")
	int meId;
	@Column(name="me_name")
	String meName;
	@Column(name="me_price",columnDefinition="decimal",precision = 10,scale=2)
	Double mePrice;
	@Column(name="me_date_of_launch")
	Date meDateOfLaunch;
	@Column(name="me_active")
	String meActive;
	@Column(name="me_category")
	String meCatagory;
	@Column(name="me_free_delivery")
	String meFreeDelivery;
}
