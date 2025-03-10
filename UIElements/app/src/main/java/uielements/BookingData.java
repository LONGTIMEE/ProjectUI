package uielements;

public class BookingData {
    private String selectedCar;
    private String pickupLocation;
    private String pickupDate;
    private String returnDate;
    private String paymentAmount;

    // Getters และ Setters
    public String getSelectedCar() { return selectedCar; }
    public void setSelectedCar(String selectedCar) { this.selectedCar = selectedCar; }

    public String getPickupLocation() { return pickupLocation; }
    public void setPickupLocation(String pickupLocation) { this.pickupLocation = pickupLocation; }

    public String getPickupDate() { return pickupDate; }
    public void setPickupDate(String pickupDate) { this.pickupDate = pickupDate; }

    public String getReturnDate() { return returnDate; }
    public void setReturnDate(String returnDate) { this.returnDate = returnDate; }

    public String getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(String paymentAmount) { this.paymentAmount = paymentAmount; }
}