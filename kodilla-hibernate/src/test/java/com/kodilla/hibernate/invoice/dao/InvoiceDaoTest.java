package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Carrot");
        Product product2 = new Product("Apple");
        Product product3 = new Product("iPhone");
        Product product4 = new Product("Water");

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        productDao.save(product4);

        Invoice invoice1 = new Invoice("13213123");
        Invoice invoice2 = new Invoice("21312323");

        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);

        Item item1 = new Item(product1, new BigDecimal(10), 2, invoice1);
        Item item2 = new Item(product2, new BigDecimal(20), 1, invoice1);
        Item item3 = new Item(product3, new BigDecimal(3000), 1, invoice2);
        Item item4 = new Item (product4, new BigDecimal(10), 3, invoice1);

        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);

        //When
        int invoiceOne = invoice1.getId();
        int invoiceTwo = invoice2.getId();


        //Then
        assertNotEquals(0, invoiceOne);
        assertNotEquals(0L, invoiceTwo);
        assertEquals(70, invoiceOne);
        assertEquals(3000, invoiceTwo);

        //CleanUp
        try {
            invoiceDao.deleteById(invoiceOne);
            invoiceDao.deleteById(invoiceTwo);
        } catch (Exception e) {
            //do nothing
        }

    }
}
