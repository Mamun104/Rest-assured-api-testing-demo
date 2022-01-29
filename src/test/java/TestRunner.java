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
}
