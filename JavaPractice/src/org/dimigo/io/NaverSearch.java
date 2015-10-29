package org.dimigo.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class NaverSearch {

	public static final String NAVER_OPEN_URL = "http://openapi.naver.com/search";
	public static final String SEARCH_KEY = "f45d2780e74669231a450c8cb3ffc78f";
	
	public static void main(String[] args) {		
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		
	    try {
	    	String input = null;
	    	
	    	/********************************************************
	         * 표준입력으로 검색할 키워드를 입력받기
	         * > 키워드를 입력하세요 => 스타워즈
	         ********************************************************/

			Scanner scanner = new Scanner(System.in);
			System.out.print("키워드를 입력하세요 : ");
			input = scanner.nextLine();
			scanner.close();

			StringBuffer sb = new StringBuffer(NAVER_OPEN_URL);
	    	sb.append("?key=").append(SEARCH_KEY).append("&query=").append(input)
	    	  .append("&display=10&start=1&target=movie");
	    	
	    	HttpGet httpget = new HttpGet(sb.toString());
	        System.out.println("Executing request " + httpget.getRequestLine());

	        ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
	            public String handleResponse(
	                    final HttpResponse response) throws ClientProtocolException, IOException {
	                int status = response.getStatusLine().getStatusCode();
	                if (status >= 200 && status < 300) {
	                    HttpEntity entity = response.getEntity();
	                    return entity != null ? EntityUtils.toString(entity) : null;
	                } else {
	                    throw new ClientProtocolException("Unexpected response status: " + status);
	                }
	            }
	        };
	        
	        String responseBody = httpclient.execute(httpget, responseHandler);
	        System.out.println("----------------------------------------");
	        System.out.println(responseBody);	        
	        
	        List<Movie> movies = NaverMovieXMLParser.parse(responseBody);
	        
	        System.out.println(movies);
	        
	        /********************************************************
	         * 검색된 순서대로 출력하기
	         * 1. 스타워즈 에피소드 8 - [오스카 아이삭, 베네치오 델 토로]
	         * 2. 스타 워즈 앤솔로지: 로그 원 - [펠리시티 존스, 벤 멘델슨, .. ]
	         * 3. 스타워즈: 깨어난 포스 - [해리슨 포드, 마크 해밀, 캐리 피셔, .. ]
	         ********************************************************/

			int count = 1;

			try(
				BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/Leehankyeol/git/JavaPractice/JavaPractice/files/movies.txt")))
			{
				for (Movie movie : movies)
				{
					String string =  count++ + ". "+ movie.getTitle()+ " - " +movie.getActors()+"\n";
					bw.write(string);
				}
			}
			 catch (Exception e) {
			e.printStackTrace();
		}

	    } catch (IOException e) {
			e.printStackTrace();
		} finally {
	        try {
				if(httpclient != null) httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	}
}