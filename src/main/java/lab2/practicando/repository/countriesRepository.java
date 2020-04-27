package lab2.practicando.repository;

import lab2.practicando.entity.countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface countriesRepository extends JpaRepository<countries, Integer> {

}
