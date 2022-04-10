package mx.com.vemm;

import mx.com.vemm.generics.GenericMethodExample;
import mx.com.vemm.generics.SubstitutionPrincipleExample;
import mx.com.vemm.generics.VarargsExample;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) {
        /* 2. GENERICS IN JAVA */
        /* generic methods */
        GenericMethodExample.display();
        /* using varargs */
        VarargsExample.display();
        /* Substitution principle */
        SubstitutionPrincipleExample.display();
    }
}
