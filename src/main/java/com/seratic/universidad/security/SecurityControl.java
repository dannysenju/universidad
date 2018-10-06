/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seratic.universidad.security;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Singleton for security control
 *
 * @author danny
 */
public class SecurityControl {

    private static SecurityControl instance = new SecurityControl();

    private SecurityControl() {

    }

    public static SecurityControl getInstance() {
        return instance;
    }

    public String encriptKey(String key) {
        return DigestUtils.sha512Hex(key);
    }

    public static void main(String[] args) {
        System.out.println(SecurityControl.getInstance().encriptKey("1234"));
    }

}
