package _04_netflix;

public class NetflixRunner {
	public static void main(String[] args) {
		Movie Aladin = new Movie("Aladin",4);
		Movie Uno = new Movie("Uno",1);
		Movie lionKing = new Movie("LionKing",5);
		Movie SpaceJam = new Movie("SpaceJam",3);
		Movie toyStory = new Movie("ToyStory",2);
		System.out.println(toyStory.getTicketPrice());
		NetflixQueue que =new NetflixQueue();
		que.addMovie(toyStory);
		que.addMovie(Aladin);
		que.addMovie(lionKing);
		que.addMovie(SpaceJam);
		que.addMovie(Uno);
		System.out.println(que);
		System.out.println(que.getBestMovie());
		que.getBestMovie();
		
	}
}
