package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: Seller findByDepartment ====");
		Department department = new Department(2,null);
		List<Seller> sellers = sellerDao.findByDepartment(department);
		for (Seller obj : sellers) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: Seller findAll====");
		sellers = sellerDao.findAll();
		for (Seller obj : sellers) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: Seller insert ====");
		Seller newSeller = new Seller(null,"Greg","greg@gmail.com", new Date() ,4000.0,department );
		sellerDao.insert(newSeller);
		System.out.println("Inserted ! New id = " + newSeller.getId());
		
		
		System.out.println("\n=== TEST 5: Seller Update ====");
		seller = sellerDao.findById(8);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 6: Seller DeleteById ====");
		System.out.println("Enter id for delete test: ");
		sellerDao.delete(sc.nextInt());
		System.out.println("Delete completed!");*/
		
		DepartmentDao deparmentDao= DaoFactory.createDepartment();
		System.out.println("=== TEST 7: Department findById ====");
		Department dep = deparmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 8: Department findAll ====");
		List<Department> list = deparmentDao.findAll();
		for(Department  d : list ) {
			System.out.println(d);
		}
		
		/*System.out.println("\n=== TEST 8: Department Insert ====");
		Department newDepartment = new Department(null, "Music");
		deparmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id : " + newDepartment.getId());
	*/
		System.out.println("\n=== TEST 9: Department Update ====");
		Department dep2 = deparmentDao.findById(5);
		dep2.setName("Food");
		deparmentDao.update(dep2);
		System.out.println("Update Completed");
		
		System.out.println("\n=== TEST 9: Department Delete ====");
		System.out.println("Enter id for delete test :");
		deparmentDao.delete(sc.nextInt());
		System.out.println("Delete Completed");
	}

}
