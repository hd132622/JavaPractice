package org.dimigo.exception;

public class MoiveTest {

	public static void main(String[] args) {
		
		try{
			Movie[] movies = {
					new Movie("앤트맨",12),
					new Movie("사도",12),
					new Movie("베테랑",15)
			};
		
		int age = 13;
		
		for(Movie movie : movies){
			buyTicket(movie,age); // 여기서 예외 던짐
		}
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	private static void buyTicket(Movie movie, int age) throws Exception{
		if(age<movie.getLimitAge()){
			System.out.println(movie.getTitle() + "은/는" + movie.getLimitAge() + "관람가입니다.");
		}
		
		else{
			System.out.println(movie.getTitle() + "영화 즐감하세요~~");
		}
		
	}
	
}