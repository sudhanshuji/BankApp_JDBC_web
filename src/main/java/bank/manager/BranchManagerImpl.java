/**
 * 
 */
package bank.manager;

import bank.dao.AdminDao;
import bank.entity.Branch;
import bankdao.impl.AdminDaoImpl;

/**
 * @author saura
 *
 */
public class BranchManagerImpl implements BranchManager {

	public boolean validateIfscCode(String ifscCode) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean insertBranch(Branch branch) {
		// TODO Auto-generated method stub
		AdminDao adminDao = new AdminDaoImpl();
		return adminDao.insertBranch(branch);
	}
	

}
