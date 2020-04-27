package lab2.practicando.repository;

import lab2.practicando.entity.departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface departmentsRepository extends JpaRepository<departments,Integer> {
}
