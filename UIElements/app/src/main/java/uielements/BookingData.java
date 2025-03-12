package uielements;

import java.time.LocalDate;

// public class BookingData {
//     private String selectedCar;
//     private String pickupLocation;
//     private String pickupDate;
//     private String returnDate;
//     private String paymentAmount;

//     // Getters และ Setters
//     public String getSelectedCar() { return selectedCar; }
//     public void setSelectedCar(String selectedCar) { this.selectedCar = selectedCar; }

//     public String getPickupLocation() { return pickupLocation; }
//     public void setPickupLocation(String pickupLocation) { this.pickupLocation = pickupLocation; }

//     public String getPickupDate() { return pickupDate; }
//     public void setPickupDate(String pickupDate) { this.pickupDate = pickupDate; }

//     public String getReturnDate() { return returnDate; }
//     public void setReturnDate(String returnDate) { this.returnDate = returnDate; }

//     public String getPaymentAmount() { return paymentAmount; }
//     public void setPaymentAmount(String paymentAmount) { this.paymentAmount = paymentAmount; }
// }

public class BookingData {
    private String selectedCar;
    private String pickupLocation;
    private LocalDate pickupDate; // ใช้ LocalDate แทน String
    private String pickupTime; // เพิ่มฟิลด์นี้
    private LocalDate returnDate; // ใช้ LocalDate แทน String
    private String returnTime; // เพิ่มฟิลด์นี้
    private String paymentAmount;

    // Getter และ Setter สำหรับ selectedCar
    public String getSelectedCar() { return selectedCar; }
    public void setSelectedCar(String selectedCar) { this.selectedCar = selectedCar; }

    // Getter และ Setter สำหรับ pickupLocation
    public String getPickupLocation() { return pickupLocation; }
    public void setPickupLocation(String pickupLocation) { this.pickupLocation = pickupLocation; }

    // Getter และ Setter สำหรับ pickupDate
    public LocalDate getPickupDate() { return pickupDate; }
    public void setPickupDate(LocalDate pickupDate) { this.pickupDate = pickupDate; }

    // Getter และ Setter สำหรับ pickupTime
    public String getPickupTime() { return pickupTime; }
    public void setPickupTime(String pickupTime) { this.pickupTime = pickupTime; }

    // Getter และ Setter สำหรับ returnDate
    public LocalDate getReturnDate() { return returnDate; }
    public void setReturnDate(LocalDate returnDate) { this.returnDate = returnDate; }

    // Getter และ Setter สำหรับ returnTime
    public String getReturnTime() { return returnTime; }
    public void setReturnTime(String returnTime) { this.returnTime = returnTime; }

    // Getter และ Setter สำหรับ paymentAmount
    public String getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(String paymentAmount) { this.paymentAmount = paymentAmount; }
}