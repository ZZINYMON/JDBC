package com.ohgiraffers.section01.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application01 {

    public static void main(String[] args) {

        /* DB 접속을 위한 Connection instance를 만들기 위한 레퍼런스 변수 선언 */
        Connection con = null;


        /* 사용할 Driver 등록 */
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/menudb", "ohgiraffers", "ohgiraffers");

            System.out.println("con = " + con);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }

        /* DriverManager를 이용해 Connection 생성 */


    }




}