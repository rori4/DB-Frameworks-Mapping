package app.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import app.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {


}