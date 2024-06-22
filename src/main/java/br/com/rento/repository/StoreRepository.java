package br.com.rento.repository;

import br.com.rento.model.Store;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository
                extends PagingAndSortingRepository<Store, Long>, ListCrudRepository<Store, Long>,
                JpaSpecificationExecutor<Store> {
}