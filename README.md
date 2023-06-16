<h1 align = "center"> Car Service App </h1>
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>

The Car Service System is a command-line application that allows users to generate a bill for car services based on the chosen car type and selected services.

### Tech Stack :-
* Java

### Features :-
* Choose a car type from Hatchback, Sedan, or SUV.
* Select multiple services from the available service list.
* Calculate the total bill based on the car type and selected services.
* Display the generated bill, including the car type, selected services, and the total bill amount.
* Provide complimentary cleaning if the total bill exceeds ₹10,000.

## Getting Started
### Prerequisites
* Java Development Kit (JDK) installed
* Java IDE or Command-line interface
### Setup and Running
* Clone the repository or download the source code.
* Open the project in your Java IDE or navigate to the project directory using the command-line interface.
* Build the project to compile the Java files.
  - javac CarServiceStation.java
* Run the application.
   - java CarServiceStation
* Follow the prompts in the console to choose the car type, select services, and generate the bill.

## Service and Pricing Configuration
The service types and their corresponding prices are configured within the code. To modify or add new services and their prices, locate the servicePrices map in the CarServiceSystem class and update it accordingly.
 - private static Map<String, Map<String, Integer>> servicePrices = new HashMap<>();

The outer map contains the car types as keys, and each car type maps to an inner map. The inner map contains service codes as keys and their corresponding prices as values. Update the map entries to reflect the desired services and prices.

## Car Class
The `Car` class represents a car and has the following attributes and methods:
- `type`: A private string variable that stores the type of the car.
- `Car(String type)`: A constructor that initializes the `type` of the car.
- `getType()`: A method that returns the type of the car.

## CarServiceStation Class
The `CarServiceStation` class is the entry point of the application. It contains the main method and handles user input for selecting the car type and service codes. It utilizes the `CarServiceStation` and `BillGenerator` classes to generate the bill.

## CarService Class
The `CarServiceStation` class represents the car service station. It has the following attributes and methods:
- `carTypes`: A `Map` that stores the available car types and their corresponding `Car` objects.
- `services`: A `Map` that stores the available services and their corresponding `Service` objects.
- `CarServiceStation(Map<String, Car> carTypes, Map<String, Service> services)`: A constructor that initializes the car types and services.
- `getServicePrice(String serviceCode, String carType)`: A method that retrieves the price of a service for a specific car type.

## Service Class
The `Service` class represents a service offered by the car service station. It has the following attributes and methods:
- `code`: A private string variable that stores the code of the service.
- `name`: A private string variable that stores the name of the service.
- `prices`: A `Map` that stores the prices of the service for different car types.
- `Service(String code, String name)`: A constructor that initializes the code and name of the service.
- `setPrice(String carType, int price)`: A method that sets the price of the service for a specific car type.
- `getPrice(String carType)`: A method that retrieves the price of the service for a specific car type.

## BillGeneratorClass
The `BillGenerator` class generates a detailed bill based on the selected car type and service codes. It has the following attributes and methods:
- `serviceStation`: A reference to the `CarServiceStation` object.
- `BillGenerator(CarServiceStation serviceStation)`: A constructor that initializes the `serviceStation` reference.
- `generateBill(String carType, String[] serviceCodes)`: A method that generates the bill by calculating the total charges for the selected services and displaying the details. It also checks if the total bill is more than ₹10,000 and displays a complimentary cleaning message if applicable.

## Usage
1. Run the `CarServiceStation App` class.
2. Select the car type from the provided options: Sedan, Hatchback, SUV.
3. Enter the number of services needed.
4. Enter the service codes for each service needed.
5. The application will generate a detailed bill, displaying the car type, service codes, charges for each service, total bill amount, and a complimentary cleaning message if the total bill exceeds ₹10,000.

## Author
👤 **Pooja Gurnule**
* GitHub: [Pooja Gurnule](https://github.com/poojagurnule)

---

## 🤝 Contributing

 - Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page]("url").
---

## Show your support
Give a ⭐️ if this project helped you!

---

## 📝 License
Copyright © 2023 [Pooja Gurnule](https://github.com/poojagurnule).<br />
