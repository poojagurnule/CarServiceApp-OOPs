public class Bill {
    private CarService carService;
    private Service services;

    public Bill(CarService carService) {
        this.carService =  carService;


    }

    public void generateBill(String carType, String[] serviceCodes) {
        System.out.println("Type of Car: " + carType);
        System.out.println("Service Codes: " + String.join(", ", serviceCodes));

        int totalBill = 0;

        for (String serviceCode : serviceCodes) {
            int servicePrice = carService.getServicePrice(serviceCode, carType);
            System.out.println("Charges for " + serviceCode + " - ₹ " + servicePrice);
            totalBill += servicePrice;
        }

        System.out.println("Total Bill - ₹ " + totalBill);
        System.out.println("--------------------------");

        if (totalBill > 10000) {
            System.out.println("Complimentary cleaning provided.");
        }
    }



}