/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw.ejb;

import javax.ejb.Remote;

/**
 *
 * @author weishi
 */
@Remote
public interface SWHelloWorldBeanRemote {

    String sayHello(String name);
    
}
