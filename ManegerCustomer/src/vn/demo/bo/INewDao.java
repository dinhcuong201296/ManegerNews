package vn.demo.bo;

import java.sql.Statement;

import vn.demo.bo.*;
public interface INewDao {
  public void addNews(Statement stt);
  public void deleteNewsByName(String s, Statement stt);
  public void findNewsByName(String s, Statement stt);
  public void getNews(Statement stt);
  public void updateNewsByName(String s, Statement stt);

	
}
