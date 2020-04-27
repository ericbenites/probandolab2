package lab2.practicando.repository;

import lab2.practicando.entity.locations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<locations,Integer> {
}
