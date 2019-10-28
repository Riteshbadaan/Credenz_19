package com.pisb.credenz19;

public class participant {

    public String part1,receiptno,events;

    public participant() {
    }

    public participant(String part1, String receiptno, String events) {
        this.part1 = part1;
        this.receiptno = receiptno;
        this.events = events;
    }

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getReceiptno() {
        return receiptno;
    }

    public void setReceiptno(String receiptno) {
        this.receiptno = receiptno;
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }
}
