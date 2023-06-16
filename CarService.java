import java.util.Map;

public  class CarService {
    private Map<String, Car> carTypes;
    private Map<String, Service> services;

    public CarService(Map<String, Car> carTypes, Map<String, Service> services) {
        this.carTypes = carTypes;
        this.services = services;
    }

    public int getServicePrice(String serviceCode, String carType) {
        Service service = services.get(serviceCode);
        return service.getPrice(carType);
    }

    public Service getServiceByCode(String serviceCode) {
        return services.get(serviceCode);
    }
}
