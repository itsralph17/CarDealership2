package com.learntocode;

public class SalesContract extends Contract{
    private double salesTaxAmount;
    private double recordingFees;
    private double processingFee;
    private boolean financed;

    public SalesContract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSold, double salesTaxAmount, double recordingFees, double processingFee, boolean financed) {
        super(dateOfContract, customerName, customerEmail, vehicleSold);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFees = recordingFees;
        this.processingFee = processingFee;
        this.financed = financed;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public double getRecordingFees() {
        return recordingFees;
    }

    public void setRecordingFees(double recordingFees) {
        this.recordingFees = recordingFees;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinanced() {
        return financed;
    }

    public void setFinanced(boolean financed) {
        this.financed = financed;
    }

    public void getTotalPrice(){

    }
    public void getMonthlyPayment(){

    }
}
