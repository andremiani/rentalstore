package br.com.rento.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.rento.model.Company;

@Repository
public interface CompanyRepository
                extends PagingAndSortingRepository<Company, Long>, ListCrudRepository<Company, Long>,
                JpaSpecificationExecutor<Company> {
}