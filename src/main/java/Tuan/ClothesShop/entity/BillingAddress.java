package Tuan.ClothesShop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="billing_address")
public class BillingAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String billingAddressId;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String country;

	@OneToOne(mappedBy = "billingAddress")
	private Customer customer;
}
