package mypackage;
public class movie_1 {
public static void main(String[] args) {
	movie m=new movie();
	m.setMovieName("Pathaan");  //setting value in MovieName
	m.setMovieStartTime("11 a.m");   //setting value in Movie_Start_Time
	m.setMovieEndTime("2 p.m");   //setting value in Movie_end_time
	m.setMoviePrice(250);         //setting values in MoviePrice
	System.out.println("Movie is:"+m.getMovieName());   //getting the value of movie
	System.out.println("Movie Start Time is:"+m.getMovieStartTime());  //getting the value of start movie
	System.out.println("Movie End Time is:"+m.getMovieEndTime());     //getting the value of end movie
	System.out.println("Movie Price is:"+m.getMoviePrice());          //getting the value of MoviePrice
}
}
