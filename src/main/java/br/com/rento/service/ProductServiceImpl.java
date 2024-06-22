package br.com.rento.service;

import br.com.rento.exception.ResourceNotFoundException;
import br.com.rento.model.Product;
import br.com.rento.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findOne(Long id) {
        Product product = productRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        return product;
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        Page<Product> resultPage = productRepository.findAll(pageable);
        if (pageable.getPageNumber() > resultPage.getTotalPages())
            throw new ResourceNotFoundException("Product", "id", resultPage);
        return resultPage;
    }

    @Override
    public List<Product> findAll(Specification<Product> spec) {
        return productRepository.findAll(spec);
    }

    @Override
    public Product update(Long id, Product productDetails) {
        Product product = productRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        if (product == null)
            throw new ResourceNotFoundException("Product", "id", id);

        product.setName(productDetails.getName());
        product.setProductId(productDetails.getProductId());
        product.setSkuId(productDetails.getSkuId());
        product.setDimensions(productDetails.getDimensions());
        product.setCategoryId(productDetails.getCategoryId());
        product.setStore(productDetails.getStore());
        return productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        Product product = productRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        if (product == null)
            throw new ResourceNotFoundException("Product", "id", id);

        productRepository.delete(product);
    }

}
