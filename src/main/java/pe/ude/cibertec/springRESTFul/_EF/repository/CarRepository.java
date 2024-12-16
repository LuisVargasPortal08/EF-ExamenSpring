package pe.ude.cibertec.springRESTFul._EF.repository;

import org.springframework.data.repository.CrudRepository;
import pe.ude.cibertec.springRESTFul._EF.entity.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {
}
