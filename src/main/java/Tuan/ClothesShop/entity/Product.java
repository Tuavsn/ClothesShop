package Tuan.ClothesShop.entity;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String productId;
	@Column(name = "category")
	private String productCategory;
	@Column(name = "description")
	private String productDescription;
	@Column(name = "manufracturer")
	private String productManufacturer;
	@NotEmpty(message = "Tên sản phẩm là bắt buộc")
	@Column(name = "name")
	private String productName;
	@NotNull(message = "Vui lòng nhập giá")
	@Column(name = "price")
	private double productPrice;
	@Column(name = "unit")
	private String unitStock;
	@Transient
	private MultipartFile productImage;
}
