/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.tth.hibernatedemo;

import com.tth.pojo.Category;
import com.tth.reponsitory.impl.CategoryRepositoryImpl;
import com.tth.reponsitory.impl.ProductRepositoryImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {

//            Query q = s.createQuery("From Category"); 
//            List<Category> cates = q.getResultList();
//            
//            cates.forEach(c -> System.out.println(c.getName()));
//        ProductRepositoryImpl s = new ProductRepositoryImpl();
//        Map<String, String> params = new HashMap<>();
//        params.put("fromPrice", "18000000");
//            s.getProducts(params).forEach(p -> System.out.printf("%d - %s - %.1f - %s\n",p.getId(), p.getName(),
//                    p.getPrice(), p.getCategoryId().getName()));
          CategoryRepositoryImpl c = new CategoryRepositoryImpl();
          
    }
}
