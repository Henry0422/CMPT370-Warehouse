/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;
import database.manager.ManagerDB;

/**
 *
 * @author hanrongli
 */
public class manageEmployee
{
    private ManagerDB database;
    private String[] newEmployee;
    private String name;
    private String number;
    private String title;


    public manageEmployee()
    {
        newEmployee = new String[3];
        database = new ManagerDB();
    }

    public Object[] getEmployeeList()
    {
        Object[] tempArray;
        tempArray = database.getEmployeesList();
        return tempArray;
    }

    public String[] getNew()
    {

        return newEmployee;
    }

    public void setNew(String name, String number, String title)
    {

        newEmployee[0] = new String(name);
        newEmployee[1] = new String(number);
        newEmployee[2] = new String(title);

        database.addEmployee(name, Integer.parseInt(number), title);
    }

    public void deleteEmployee(Object valueAt) {
       database.deleteEmployee((int) valueAt);
    }
    
    public void setName(String name, int employeeId){
        database.setEmployeeName(name, employeeId);
    }
    
    public void setTitle(String title, int employeeId){
        database.setTitle(title, employeeId);
    }
    
}
