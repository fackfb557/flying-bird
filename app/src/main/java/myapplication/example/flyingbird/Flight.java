package myapplication.example.flyingbird;

public class Flight {

        private String flightNumber;
        private String departureAirport;
        private String arrivalAirport;
        private String departureTime;
        private String arrivalTime;

        public Flight(String flightNumber, String departureAirport, String arrivalAirport, String departureTime, String arrivalTime) {
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

        public String getDepartureTime() {
            return departureTime;
        }

        public void setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
        }

        public String getArrivalTime() {
            return arrivalTime;
        }

        public void setArrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
        }

    public long calculateFlightDuration() {
        String[] departureTokens = departureTime.split(":");
        String[] arrivalTokens = arrivalTime.split(":");

        int departureHours = Integer.parseInt(departureTokens[0]);
        int departureMinutes = Integer.parseInt(departureTokens[1]);
        int departureSeconds = Integer.parseInt(departureTokens[2]);

        int arrivalHours = Integer.parseInt(arrivalTokens[0]);
        int arrivalMinutes = Integer.parseInt(arrivalTokens[1]);
        int arrivalSeconds = Integer.parseInt(arrivalTokens[2]);

        long departureTotalSeconds = departureHours * 3600 + departureMinutes * 60 + departureSeconds;
        long arrivalTotalSeconds = arrivalHours * 3600 + arrivalMinutes * 60 + arrivalSeconds;

        return arrivalTotalSeconds - departureTotalSeconds;
    }

}
