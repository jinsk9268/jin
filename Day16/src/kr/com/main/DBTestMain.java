package kr.com.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.com.db.DBConnection;

public class DBTestMain {

	public static void main(String[] args) {
		
		try {
			//DB커넥션 가져오기
			Connection con = DBConnection.getConnection();
			
			//SQL를 작성
			StringBuilder sql = new StringBuilder();
			
			sql.append(" SELECT st.*,    \n"); //select 하나만있어야됨 st.* st테이블의 모든것
			sql.append("         j.*      \n"); // j.* j테이블의 모든것
			sql.append("FROM student st \n");
			sql.append("   INNER JOIN jumsu j ON st.st_num = j.st_num \n");
			
			//sql을 DB에 전달하는 문서
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			
			/**
			 * 문서에서 sql을 실행하는 구문은
			 * excuteQuery()와 excuteUpdate()이 있다.
			 * 차이는 전자는 쿼리를 실행 후  select된 결과를 가져오는 것이고
			 * 후자는 쿼리의 실행의 성공(1) / 실패(-1) / 미실행(0) 결과만 가져온다
			 * 그래서 select 쿼리를 실행하는 구문은 excuteQuery()
			 * 나머지 create / update / delete 구문을 실행하는 메서드는 excuteUpdate(), 리턴타입 인트 이다.
			 */
			ResultSet res = pstmt.executeQuery();
			List<Student> list = new ArrayList<Student>();
			
			//단건, next는 한번만 돌기때문에
			/*
			 * if(res.next()) {
			 * 
			 * }
			 */
			
			//여러건
			while(res.next()) {
				Student st = new Student();
				
				st.setStNum(res.getInt("st_num"));
				st.setStName(res.getString("st_name"));
				st.setStAge(res.getInt("st_age"));
				st.setStGender(res.getString("st_gender"));
				st.setStKor(res.getInt("st_kor"));
				st.setStEng(res.getInt("st_eng"));
				st.setStMath(res.getInt("st_math"));
				
				list.add(st);
			}
			
			for(Student st : list) {
				System.out.println(st);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
