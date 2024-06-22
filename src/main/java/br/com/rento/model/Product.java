package br.com.rento.model;

import java.util.Date;
import java.util.Map;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "product")

@Getter
@Setter
@ToString
@AllArgsConstructor

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", length = 255)
	private String name;

	@Column(name = "product_id", length = 7)
	private int productId;

	@Column(name = "sku_id", length = 7)
	private int skuId;

	@Column(name = "category_id")
	private String categoryId;

	@ElementCollection
	@CollectionTable(name = "product_dimensions", joinColumns = @JoinColumn(name = "product_id"))
	@MapKeyColumn(name = "dimension_name")
	@Column(name = "dimension_value")
	private Map<String, Double> dimensions;

	@ManyToOne
	@JoinColumn(name = "store_id", nullable = false)
	private Store store;

	@CreatedBy
	private String createdBy;

	@LastModifiedBy
	private String lastModifiedBy;

	@CreationTimestamp
	@Column(updatable = false, name = "created_at")
	private Date createdAt;

	@UpdateTimestamp
	@Column(name = "updated_at")
	private Date updatedAt;

}
