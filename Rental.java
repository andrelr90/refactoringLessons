public class Rental {

   private Movie _movie;
   private int _daysRented;

   public int getFrequentRenterPoints() {
       //Adicionar o trecho de código extraído.
       if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) && this.getDaysRented() <= 1)
          return 1;
       // add bonus for a two day new release rental
       else
          return 2;
   }

   public double getCharge() {
      return _movie.getCharge(_daysRented);
   }

   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }

   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }
}
