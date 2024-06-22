package br.com.rento.repository;

import br.com.rento.model.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository
                extends PagingAndSortingRepository<Product, Long>, ListCrudRepository<Product, Long>,
                JpaSpecificationExecutor<Product> {

        List<Product> findByCategoryId(String category_id);
}
