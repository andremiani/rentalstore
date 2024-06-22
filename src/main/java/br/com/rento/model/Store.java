package br.com.rento.model;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)

@Table(name = "store")
public class Store {
    @Schema(name = "Id Loja")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Schema(name = "Nome da Loja")
    @Column(name = "name", length = 255)
    private String name;

    @Schema(name = "URL da Loja")
    @Column(name = "url", length = 255)
    private String url;

    @Schema(name = "Limite de Produtos Permitido")
    @Column(name = "maxProducts", length = 7)
    private int maxProducts;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)

    private Company company;

    @OneToMany(mappedBy = "store")
    private List<Product> product;

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
