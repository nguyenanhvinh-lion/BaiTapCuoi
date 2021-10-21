/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renthousemanagement;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Maiyon
 */
public class Customer {

    private String CustomerId;
    private String CustomerName;
    private String StartedDay;
    private int CustomerType;
    private float rentBill;
    private float electricityBill;
    private float waterBill;
    private float cleaningBill;

    public Customer() {
    }

    public Customer(String CustomerId, String CustomerName, String StartedDay, int CustomerType, float rentBill, float electricityBill, float waterBill, float cleaningBill) {
        this.CustomerId = CustomerId;
        this.CustomerName = CustomerName;
        this.StartedDay = StartedDay;
        this.CustomerType = CustomerType;
        this.rentBill = rentBill;
        this.electricityBill = electricityBill;
        this.waterBill = waterBill;
        this.cleaningBill = cleaningBill;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getStartedDay() {
        return StartedDay;
    }

    public void setStartedDay(String StartedDay) {
        this.StartedDay = StartedDay;
    }

    public int getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(int CustomerType) {
        this.CustomerType = CustomerType;
    }

    public float getRentBill() {
        return rentBill;
    }

    public void setRentBill(float rentBill) {
        this.rentBill = rentBill;
    }

    public float getElectricityBill() {
        return electricityBill;
    }

    public void setElectricityBill(float electricityBill) {
        this.electricityBill = electricityBill;
    }

    public float getWaterBill() {
        return waterBill;
    }

    public void setWaterBill(float waterBill) {
        this.waterBill = waterBill;
    }

    public float getCleaningBill() {
        return cleaningBill;
    }

    public void setCleaningBill(float cleaningBill) {
        this.cleaningBill = cleaningBill;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.CustomerId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (!Objects.equals(this.CustomerId, other.CustomerId)) {
            return false;
        }
        return true;
    }
    public float tinhTienPhong() {
        return this.getRentBill() / this.getCustomerType();
    }
    public float tinhTienDien(){
        return this.getElectricityBill() / this.getCustomerType();
    }
    public float tinhTienNuoc(){
        return this.getWaterBill() / this.getCustomerType();
    }
    public float tinhTienVeSinh(){
        return this.getCleaningBill() / this.getCustomerType();
    }
    public float tinhTienDichVu(){
        return this.getRentBill() + this.getElectricityBill() + this.getWaterBill() + this.getCleaningBill();
    }
    @Override
    public String toString(){
        return "Khách hàng:"
                + "\nMã khách hàng: " + this.getCustomerId()
                + "\nTên khách hàng: " + this.getCustomerName()
                + "\nNgày bắt đầu: " + this.getStartedDay()
                + "\nLoại khách hàng: " + this.getCustomerType() + " người"
                + "\nTiền thuê phòng: " + this.getRentBill() + " - Tiền 1 người: " + this.tinhTienPhong()
                + "\nTiền điện: " + this.getElectricityBill()+ " - Tiền 1 người: " + this.tinhTienDien()
                + "\nTiền nước: " + this.getWaterBill()+ " - Tiền 1 người: " + this.tinhTienNuoc()
                + "\nTiền vệ sinh: " + this.getCleaningBill()+ " - Tiền 1 người: " + this.tinhTienVeSinh()
                + "\nTổng tiền dịch vụ hàng tháng: " + this.tinhTienDichVu();
    }
}
