package com.tallerdevehiculos.reparaciones.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "repair")
public class Repair implements Serializable{
    @DynamoDBAutoGeneratedKey
    @DynamoDBHashKey(attributeName = "rId")
    private String rId;
    @DynamoDBAttribute
    private String licensePlateVehicle;
    @DynamoDBAttribute
    private String state;
    @DynamoDBAttribute
    private String listStates;
    @DynamoDBAttribute
    private String spareParts;
    @DynamoDBAttribute
    private int cost;
    @DynamoDBAttribute
    private int partsCost;
    @DynamoDBAttribute
    private String otherCosts;
    @DynamoDBAttribute
    private String inCharge;

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public String getLicensePlateVehicle() {
        return licensePlateVehicle;
    }

    public void setLicensePlateVehicle(String licensePlateVehicle) {
        this.licensePlateVehicle = licensePlateVehicle;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getListStates() {
        return listStates;
    }

    public void setListStates(String listStates) {
        this.listStates = listStates;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPartsCost() {
        return partsCost;
    }

    public void setPartsCost(int partsCost) {
        this.partsCost = partsCost;
    }

    public String getOtherCosts() {
        return otherCosts;
    }

    public void setOtherCosts(String otherCosts) {
        this.otherCosts = otherCosts;
    }

    public String getInCharge() {
        return inCharge;
    }

    public void setInCharge(String inCharge) {
        this.inCharge = inCharge;
    }
}


