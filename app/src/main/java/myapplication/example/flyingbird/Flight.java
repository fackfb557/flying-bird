package myapplication.example.flyingbird;

import java.util.Date;

public class Flight {

        private String flightNumber;
        private String departureAirport;
        private String arrivalAirport;
        private Date departureTime;
        private Date arrivalTime;

        public Flight(String flightNumber, String departureAirport, String arrivalAirport, Date departureTime, Date arrivalTime) {
            this.flightNumber = flightNumber;
            this.departureAirport = departureAirport;
            this.arrivalAirport = arrivalAirport;
            this.departureTime = departureTime;
            this.arrivalTime = arrivalTime;
        }

        public String getFlightNumber() {
            return flightNumber;
        }

        public void setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
        }

        public String getDepartureAirport() {
            return departureAirport;
        }

        public void setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
        }

        public String getArrivalAirport() {
            return arrivalAirport;
        }

        public void setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
        }

        public Date getDepartureTime() {
            return departureTime;
        }

        public void setDepartureTime(Date departureTime) {
            this.departureTime = departureTime;
        }

        public Date getArrivalTime() {
            return arrivalTime;
        }

        public void setArrivalTime(Date arrivalTime) {
            this.arrivalTime = arrivalTime;
        }

        public long calculateFlightDuration() {
            return arrivalTime.getTime() - departureTime.getTime();
        }

}
