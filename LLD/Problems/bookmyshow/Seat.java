import enums.SeatCategory;

public class Seat {
    int seatNo;
    SeatCategory seatCategory;

    public Seat(int seatNo, SeatCategory seatCategory) {
        this.seatNo = seatNo;
        this.seatCategory = seatCategory;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public SeatCategory getSeatCategory() {
        return seatCategory;
    }

    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNo=" + seatNo +
                ", seatCategory=" + seatCategory +
                '}';
    }
}
