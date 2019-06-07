package vn.demo.Main;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import vn.demo.bo.INewDao;
import vn.demo.dao.*;
import vn.demo.Main.*;
public  class NewsDaoImpl implements INewDao {
	Scanner sc = new Scanner(System.in);

	@Override
	public void addNews(Statement stt) {
		// TODO Auto-generated method stub
		System.out.println("Nhap stt:");
		System.out.println("Nhap id:");
		int category_Id = sc.nextInt();
		System.out.println("Moi nhap ten:");
		String name = sc.nextLine();
		System.out.println("Moi nhap mo ta:");
		String description = sc.nextLine();
		System.out.println("nhap detail");
		String detail = sc.nextLine();
		System.out.println("nhap image");
		String image = sc.nextLine();
		System.out.println("nhap date");
		String date = sc.nextLine();
		System.out.println("nhap userId");
		int user_id = sc.nextInt();
		String sql = "insert into news(category_id,name,description,detail,image,date,user_id) values (" + category_Id
				+ ", '" + name + "','" + description + "'," + "'" + detail + "'," + "'" + image + "'," + "'" + date
				+ "'," + user_id + ")";
		try {
			stt.execute(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Override
	public void deleteNewsByName(String s, Statement stt) {
		// TODO Auto-generated method stub
		String sql2 = "delete from the NewByName";
		System.out.println(sql2);
		try {
			stt.execute(sql2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Override
	public void findNewsByName(String s, Statement stt) {
		// TODO Auto-generated method stub
		List<News> list = new ArrayList<News>();
		String sql = "select *from news where name = '" + s + "';";
		ResultSet rs = null;
		try {
			rs = stt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				News news = new News(0, 0, sql, sql, sql, sql, sql, 0);
				int id = rs.getInt("id");
				news.setId(id);
				int cate = rs.getInt("category_id");
				news.setCategory_id(cate);
				String name = rs.getString("name");
				news.setName(name);
				String des = rs.getString("description");
				news.setDescription(des);
				String details = rs.getString("details");
				news.setDetails(details);
				String image = rs.getString("image");
				news.setImage(image);

				Date date = (Date) rs.getDate("date");
				news.setDate(date.toString());
				int user_id = rs.getInt("user_id");
				news.setId(user_id);
				list.add(news);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("id   " + "          name        " + "                    date       ");
		for(News news : list) {
			System.out.println(news.getId() + "              "  + news.getName() + "                       " +       news.getDate());
		}

	}

	@Override
	public void getNews(Statement stt) {
		// TODO Auto-generated method stub
		List<News> list = new ArrayList<News>();
		String sql = "select *from news ;";
		ResultSet rs = null;
		try {
			rs = stt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				News news = new News(0, 0, sql, sql, sql, sql, sql,0);
				int id = rs.getInt("id");
				news.setId(id);
				int cate = rs.getInt("category_id");
				news.setCategory_id(cate);
				String name = rs.getString("name");
				news.setName(name);
				String des = rs.getString("description");
				news.setDescription(des);
				String details = rs.getString("detail");
				news.setDetails(details);
				String image = rs.getString("image");
				news.setImage(image);

				Date date = (Date) rs.getDate("date");
				news.setDate(date.toString());
				int userId = rs.getInt("userId");
				news.setUserId(userId);
				list.add(news);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("id   " + "          name        " + "                    date       ");
		for(News news : list) {
			System.out.println(news.getId() + "              "  + news.getName() + "                       " +       news.getDate());
		}

	}

	@Override
	public void updateNewsByName(String s, Statement stt) {
		// TODO Auto-generated method stub
		System.out.println("Input Date update");
		String date = sc.nextLine();
		String sql3 = "update news set date ='"+ date + "'" + " where name ='"   + s+ "'";
		try {
			stt.execute(sql3);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	
}
