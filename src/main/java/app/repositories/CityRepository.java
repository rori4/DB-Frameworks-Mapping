package app.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import app.model.City;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {


}