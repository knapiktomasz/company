package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DatabaseConfig;
import model.Employee;

public class EmployeeDao {

	private DatabaseConfig config = new DatabaseConfig();

	public void save(Employee employee) throws SQLException {
		Connection connection = config.getConnection();
		String sql = "INSERT INTO employee( name, surname,  sex, dept_no, sallary, age, position, children_quantity, pesel, marital_status) "
				+ "VALUES (?, ?,  ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, employee.getName());
		statement.setString(2, employee.getSurname());
		statement.setString(3, employee.getSex());
		statement.setInt(4, employee.getDeptNo());
		statement.setBigDecimal(5, employee.getSallary());
		statement.setInt(6, employee.getAge());
		statement.setString(7, employee.getPosition());
		statement.setInt(8, employee.getChildrenQuantity());
		statement.setString(9, employee.getPesel());
		statement.setBoolean(10, employee.isMaritalStatus());

		statement.executeUpdate();

	}

	public List<Employee> findAll() throws SQLException {
		Connection connection = config.getConnection();
		String sql = "SELECT id, name, surname,  sex, dept_no, sallary, age, position, children_quantity, pesel, marital_status FROM employee";
		PreparedStatement statement = connection.prepareStatement(sql);

		ResultSet result = statement.executeQuery();

		List<Employee> employee = new ArrayList<>();
		while (result.next()) {
			int id = result.getInt("id");
			String name = result.getString("name");
			String surname = result.getString("surname");
			String sex = result.getString("sex");
			int deptNo = result.getInt("dept_no");
			BigDecimal sallary = result.getBigDecimal("sallary");
			int age = result.getInt("age");
			String position = result.getString("position");
			int childrenQuantity = result.getInt("children_quantity");
			String pesel = result.getString("pesel");

			boolean maritalStatus = result.getInt("marital_status") == 0 ? false : true;
			employee.add(new Employee(id, name, surname, sex, deptNo, sallary, age, position, childrenQuantity, pesel,
					maritalStatus));
		}

		return employee;

	}

	public Employee findById(int id) throws SQLException {
		Connection connection = config.getConnection();
		String sql = "SELECT id,name,surname,sex,dept_no,sallary,age,position,children_quantity,pesel,marital_status FROM employee WHERE id=?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, id);
		ResultSet result = statement.executeQuery();

		Employee employee = null;
		while (result.next()) {
			String name = result.getString("name");
			String surname = result.getString("surname");
			String sex = result.getString("sex");
			int deptNo = result.getInt("dept_no");
			BigDecimal sallary = result.getBigDecimal("sallary");
			int age = result.getInt("age");
			String position = result.getString("position");
			int childrenQuantity = result.getInt("children_quantity");
			String pesel = result.getString("pesel");
			boolean maritalStatus = result.getInt("marital_status") == 0 ? false : true;
			employee = new Employee(id, name, surname, sex, deptNo, sallary, age, position, childrenQuantity, pesel,
					maritalStatus);
		}
		return employee;
	}

	public void deleteById(int id) throws SQLException {

		Connection connection = config.getConnection();

		String sql = "DELETE FROM employee WHERE id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, id);

		statement.executeUpdate();

	}

	public void update(Employee employee) throws SQLException {
		Connection connection = config.getConnection();
		String sql = "UPDATE employee SET name=?, surname=?,  sex=?, dept_no=?, sallary=?, age=?, position=?, children_quantity=?, pesel=?, marital_status=? Where id=?";
		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setString(1, employee.getName());
		statement.setString(2, employee.getSurname());
		statement.setString(3, employee.getSex());
		statement.setInt(4, employee.getDeptNo());
		statement.setBigDecimal(5, employee.getSallary());
		statement.setInt(6, employee.getAge());
		statement.setString(7, employee.getPosition());
		statement.setInt(8, employee.getChildrenQuantity());
		statement.setString(9, employee.getPesel());
		statement.setBoolean(10, employee.isMaritalStatus());
		statement.setInt(11, employee.getId());

		statement.executeUpdate();
	}

}
