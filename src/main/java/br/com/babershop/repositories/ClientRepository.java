package br.com.babershop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.babershop.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
