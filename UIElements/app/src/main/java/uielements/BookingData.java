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


/**
 * คลาส BookingData ใช้สำหรับจัดเก็บข้อมูลการจองรถเช่า
 * รถที่เลือก
 * สถานที่รับรถ
 * วันที่รับรถ
 * เวลารับรถ
 * วันที่คืนรถ
 * เวลาคืนรถ
 * จำนวนเงินที่ต้องชำระ
 */
public class BookingData {
    private String selectedCar;
    private String pickupLocation;
    private LocalDate pickupDate; 
    private String pickupTime; 
    private LocalDate returnDate; 
    private String returnTime; 
    private String paymentAmount;

    /**
     * @return รถที่เลือก
     */
    public String getSelectedCar() { 
        return selectedCar; }

    /**
     * กำหนดรถที่เลือก
     * @param selectedCar รถที่ผู้ใช้เลือก
     */
    public void setSelectedCar(String selectedCar) { 
        this.selectedCar = selectedCar; }

    /**
     * @return สถานที่รับรถ
     */
    public String getPickupLocation() { 
        return pickupLocation; }

    /**
     * กำหนดสถานที่รับรถ
     * @param pickupLocation สถานที่รับรถที่ผู้ใช้เลือก
     */
    public void setPickupLocation(String pickupLocation) { 
        this.pickupLocation = pickupLocation; }

    /**
     * @return วันที่รับรถ
     */
    public LocalDate getPickupDate() { 
        return pickupDate; }

    /**
     * กำหนดวันที่รับรถ
     * @param pickupDate วันที่ที่ผู้ใช้ต้องการรับรถ
     */
    public void setPickupDate(LocalDate pickupDate) { 
        this.pickupDate = pickupDate; }

    /**
     * @return เวลารับรถ
     */
    public String getPickupTime() { 
        return pickupTime; }

    /**
     * กำหนดเวลารับรถ
     * @param pickupTime เวลาที่ผู้ใช้ต้องการรับรถ
     */
    public void setPickupTime(String pickupTime) { 
        this.pickupTime = pickupTime; }

    /**
     * @return วันที่คืนรถ
     */
    public LocalDate getReturnDate() { 
        return returnDate; }

    /**
     * กำหนดวันที่คืนรถ
     * @param returnDate วันที่ที่ผู้ใช้ต้องการคืนรถ
     */
    public void setReturnDate(LocalDate returnDate) { 
        this.returnDate = returnDate; }

    /**
     * @return เวลาคืนรถ
     */
    public String getReturnTime() { 
        return returnTime; }

    /**
     * กำหนดเวลาคืนรถ
     * @param returnTime เวลาที่ผู้ใช้ต้องการคืนรถ
     */
    public void setReturnTime(String returnTime) { 
        this.returnTime = returnTime; }

    /**
     * @return จำนวนเงินที่ต้องชำระ
     */
    public String getPaymentAmount() { 
        return paymentAmount; }

    /**
     * กำหนดจำนวนเงินที่ต้องชำระ
     * @param paymentAmount จำนวนเงินที่ต้องชำระ
     */
    public void setPaymentAmount(String paymentAmount) { 
        this.paymentAmount = paymentAmount; }
}