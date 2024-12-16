package pe.ude.cibertec.springRESTFul._EF.response;

import pe.ude.cibertec.springRESTFul._EF.dto.CarDto;

public record FindCarsResponse(String code,
                               String error,
                               Iterable<CarDto>cars) {
}
