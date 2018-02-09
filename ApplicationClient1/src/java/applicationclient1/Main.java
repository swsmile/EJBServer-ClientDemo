/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationclient1;

import javax.ejb.EJB;
import sw.ejb.SWHelloWorldBeanRemote;

/**
 *
 * @author weishi
 */
public class Main {

    @EJB
    private static SWHelloWorldBeanRemote sWHelloWorldBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("applicationclient1.Main.main()");
        System.out.println(sWHelloWorldBean.sayHello("myName"));
    }
    
}
