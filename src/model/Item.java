package model;

import java.time.LocalDate;

public class Item {
    
    private String name;
    private LocalDate buyDate;
    private LocalDate deadline;

    public Item(String name, LocalDate buyDate, int warrantyMonth) {
        this.name = name;
        this.buyDate = buyDate;
        this.deadline = buyDate.plusMonths(warrantyMonth);
    }
    
    public Item(String name, LocalDate buyDate, LocalDate deadline) {
        this.name = name;
        this.buyDate = buyDate;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
