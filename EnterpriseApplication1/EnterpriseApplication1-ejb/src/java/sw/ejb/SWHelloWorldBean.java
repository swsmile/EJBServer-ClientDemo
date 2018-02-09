/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author weishi
 */
@Stateless
public class SWHelloWorldBean implements SWHelloWorldBeanRemote {

    @Override
    public String sayHello(String name) {
        return name + " says hello.";
    } 

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
