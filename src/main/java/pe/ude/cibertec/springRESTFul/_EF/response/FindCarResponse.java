package pe.ude.cibertec.springRESTFul._EF.response;

import pe.ude.cibertec.springRESTFul._EF.dto.CarDetailDto;

public record FindCarResponse(String code,
                              String error,
                              CarDetailDto car ){


}
