package com.backup;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.exeptions.BankAccountNotFoundExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository(value = "accDao1")
@Primary
public class AccountDaoImplJdbc implements AccountDao {

    private DataSource dataSource;

    @Autowired
    public AccountDaoImplJdbc(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Account> getAll() {
       List<Account> accounts=new ArrayList<>();
       Account account=null;
        Connection connection=null;
        try{
            connection=dataSource.getConnection();
            PreparedStatement pstmt=connection.prepareStatement("select * from account");
            ResultSet rs=pstmt.executeQuery();
            while (rs.next()){
                //int id, String name, String address, String mobile, String email
                 account=new Account(
                        rs.getInt(1),
                        rs.getString(2), rs.getDouble(3));
                accounts.add(account);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return accounts;
    }

    @Override
    public Account getById(int id) {
        Account account=null;
        Connection connection=null;
        try{
            connection=dataSource.getConnection();
            PreparedStatement pstmt=connection.prepareStatement("select * from account where id=?");
            pstmt.setInt(1, id);
            ResultSet rs=pstmt.executeQuery();
            if (rs.next()){
                //int id, String name, String address, String mobile, String email
                account=new Account(
                        rs.getInt(1),
                        rs.getString(2), rs.getDouble(3));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        if (account==null)
            throw  new BankAccountNotFoundExeption("account "+ id +" not found");
        return account;
    }
    @Override
    public void updateAccount(Account account) {
        Connection connection=null;
        try{
            connection=dataSource.getConnection();
            // address | mobile    | email
            PreparedStatement pstmt=
                    connection.prepareStatement("update account set balance=? where  id=?");

            pstmt.setDouble(1, account.getBalance());
            pstmt.setInt(2, account.getId());
            pstmt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
            try{
                connection.rollback();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void addAccount(Account account) {
        Connection connection=null;
        try{
            connection=dataSource.getConnection();

            // id | name  | address | mobile    | email
            PreparedStatement pstmt=
                    connection
                            .prepareStatement("insert into account(name, balance) values(?,?)");
            pstmt.setString(1, account.getName());
            pstmt.setDouble(2, account.getBalance());
            pstmt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
            try{
                connection.rollback();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void deleteAccount(int id) {
       Account accountToDelete=getById(id);
        Connection connection=null;
        try{
            connection=dataSource.getConnection();

            PreparedStatement pstmt=connection.prepareStatement("delete from account where id=?");
            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
            try{
                connection.rollback();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }
}
