package pe.ude.cibertec.springRESTFul._EF.dto;

public record CarDto(
        Integer carId,
        String make,
        String model,
        Integer year,
        String vin,
        String licensePlate,
        String ownerName,
        String color
) {
}
