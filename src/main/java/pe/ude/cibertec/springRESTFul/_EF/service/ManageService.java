package pe.ude.cibertec.springRESTFul._EF.service;

import pe.ude.cibertec.springRESTFul._EF.dto.CarDetailDto;
import pe.ude.cibertec.springRESTFul._EF.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {
    List<CarDto> getAllCars()throws Exception;

    Optional<CarDetailDto> getCarById(int carId) throws Exception;

    boolean updateCar(CarDto carDto) throws Exception;

    boolean deleteCarById (int carId) throws Exception;

    boolean addCar(CarDetailDto carDetailDto) throws Exception;
}
