import org.apache.commons.configuration.ConfigurationException;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestRunner {
    Customer customer;
    @Test
    public void doLogin() throws ConfigurationException, IOException {
        customer=new Customer();
        customer.callingCustomerLoginAPI();
    }
    @Test
    public void getCustomerList() throws IOException {
        customer=new Customer();
        customer.callingCustomerListAPI();

    }
    @Test
    public void searchCustomer() throws IOException {
        customer=new Customer();
        customer.searchCustomer();

    }
    @Test
    public void  generateCustomerInfo() throws IOException, ConfigurationException {

        customer = new Customer();
        customer.generateCustomer();

    }


    @Test
    public void createCustomerInfo() throws IOException, ConfigurationException {
        customer = new Customer();
        customer.createCustomer();
    }

    @Test
    public void updateCustomerInfo() throws IOException {

        customer = new Customer();
        customer.updateCustomer();
    }

    @Test
    public void deleteCustomerInfo() throws IOException {

        customer = new Customer();
        customer.deleteCustomer();
    }
}
